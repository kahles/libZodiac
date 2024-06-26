package de.kah2.zodiac.libZodiac;

import de.kah2.zodiac.libZodiac.planetary.Position;

import java.time.ZoneId;

public class MunichLocationProvider implements LocationProvider {

	public final static Position POSITION_MUNICH = new Position(48.137, 11.57521);
	public final static ZoneId TIME_ZONE_ID = ZoneId.of( "Europe/Berlin" );

	@Override
	public ZoneId getTimeZoneId() {
		return TIME_ZONE_ID;
	}

	@Override
	public Position getObserverPosition() {
		return POSITION_MUNICH;
	}
}
