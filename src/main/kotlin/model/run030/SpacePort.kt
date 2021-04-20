package model.run030

import model.run030.exception.BrokenEngineException
import model.run030.exception.OutOfFuelException
import model.run030.exception.SpaceToEarthConnectionFailedException

object SpacePort {

    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        }catch(exception: OutOfFuelException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
            spaceCraft.refuel()
        } catch (exception: BrokenEngineException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
            spaceCraft.repairEngine()
        } catch(exception: SpaceToEarthConnectionFailedException) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
            spaceCraft.fixConnection()
        } finally {
            if (spaceCraft.isInSpace) {
                spaceCraft.land()
            }else{
                investigateSpace(spaceCraft)
            }
        }
    }
}