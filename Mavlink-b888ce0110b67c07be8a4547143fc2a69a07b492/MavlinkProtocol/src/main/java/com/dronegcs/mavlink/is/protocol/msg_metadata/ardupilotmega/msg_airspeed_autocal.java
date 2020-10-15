// MESSAGE AIRSPEED_AUTOCAL PACKING
package com.dronegcs.mavlink.is.protocol.msg_metadata.ardupilotmega;

import com.dronegcs.mavlink.is.protocol.msg_metadata.MAVLinkMessage;
import com.dronegcs.mavlink.is.protocol.msg_metadata.MAVLinkPacket;
import com.dronegcs.mavlink.is.protocol.msg_metadata.MAVLinkPayload;

/**
* Airspeed auto-calibration
*/
public class msg_airspeed_autocal extends MAVLinkMessage{

	public static final int MAVLINK_MSG_ID_AIRSPEED_AUTOCAL = 174;
	public static final int MAVLINK_MSG_LENGTH = 48;
	private static final long serialVersionUID = MAVLINK_MSG_ID_AIRSPEED_AUTOCAL;
	

 	/**
	* GPS velocity north m/s
	*/
	public float vx; 
 	/**
	* GPS velocity east m/s
	*/
	public float vy; 
 	/**
	* GPS velocity down m/s
	*/
	public float vz; 
 	/**
	* Differential pressure pascals
	*/
	public float diff_pressure; 
 	/**
	* Estimated to true airspeed ratio
	*/
	public float EAS2TAS; 
 	/**
	* Airspeed ratio
	*/
	public float ratio; 
 	/**
	* EKF state x
	*/
	public float state_x; 
 	/**
	* EKF state y
	*/
	public float state_y; 
 	/**
	* EKF state z
	*/
	public float state_z; 
 	/**
	* EKF Pax
	*/
	public float Pax; 
 	/**
	* EKF Pby
	*/
	public float Pby; 
 	/**
	* EKF Pcz
	*/
	public float Pcz; 

	/**
	 * Generates the payload for a com.dronegcs.mavlink.is.mavlink message for a message of this type
	 * @return
	 */
	public MAVLinkPacket pack(){
		MAVLinkPacket packet = build(MAVLINK_MSG_LENGTH);
		packet.payload.putFloat(vx);
		packet.payload.putFloat(vy);
		packet.payload.putFloat(vz);
		packet.payload.putFloat(diff_pressure);
		packet.payload.putFloat(EAS2TAS);
		packet.payload.putFloat(ratio);
		packet.payload.putFloat(state_x);
		packet.payload.putFloat(state_y);
		packet.payload.putFloat(state_z);
		packet.payload.putFloat(Pax);
		packet.payload.putFloat(Pby);
		packet.payload.putFloat(Pcz);
		return packet;		
	}

    /**
     * Decode a airspeed_autocal message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
	    vx = payload.getFloat();
	    vy = payload.getFloat();
	    vz = payload.getFloat();
	    diff_pressure = payload.getFloat();
	    EAS2TAS = payload.getFloat();
	    ratio = payload.getFloat();
	    state_x = payload.getFloat();
	    state_y = payload.getFloat();
	    state_z = payload.getFloat();
	    Pax = payload.getFloat();
	    Pby = payload.getFloat();
	    Pcz = payload.getFloat();    
    }

     /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_airspeed_autocal(int sysid){
		super(sysid);
		msgid = MAVLINK_MSG_ID_AIRSPEED_AUTOCAL;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a com.dronegcs.mavlink.is.mavlink packet
     * 
     */
    public msg_airspeed_autocal(MAVLinkPacket mavLinkPacket){
        this(mavLinkPacket.sysid);
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "AIRSPEED_AUTOCAL");
        //Log.d("MAVLINK_MSG_ID_AIRSPEED_AUTOCAL", toString());
    }
    
                        
    /**
     * Returns a string with the MSG name and data
     */
    public String toString(){
    	return "MAVLINK_MSG_ID_AIRSPEED_AUTOCAL -"+" vx:"+vx+" vy:"+vy+" vz:"+vz+" diff_pressure:"+diff_pressure+" EAS2TAS:"+EAS2TAS+" ratio:"+ratio+" state_x:"+state_x+" state_y:"+state_y+" state_z:"+state_z+" Pax:"+Pax+" Pby:"+Pby+" Pcz:"+Pcz+"";
    }
}
