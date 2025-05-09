package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class GnssStatusCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void onFirstFix(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8659a398", new Object[]{this, new Integer(i)});
            }
        }

        public void onSatelliteStatusChanged(GnssStatusCompat gnssStatusCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a45a969", new Object[]{this, gnssStatusCompat});
            }
        }

        public void onStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb092529", new Object[]{this});
            }
        }

        public void onStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436bf075", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ConstellationType {
    }

    public static GnssStatusCompat wrap(GnssStatus gnssStatus) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GnssStatusCompat) ipChange.ipc$dispatch("2d3b1763", new Object[]{gnssStatus}) : new GnssStatusWrapper(gnssStatus);
    }

    public abstract float getAzimuthDegrees(int i);

    public abstract float getBasebandCn0DbHz(int i);

    public abstract float getCarrierFrequencyHz(int i);

    public abstract float getCn0DbHz(int i);

    public abstract int getConstellationType(int i);

    public abstract float getElevationDegrees(int i);

    public abstract int getSatelliteCount();

    public abstract int getSvid(int i);

    public abstract boolean hasAlmanacData(int i);

    public abstract boolean hasBasebandCn0DbHz(int i);

    public abstract boolean hasCarrierFrequencyHz(int i);

    public abstract boolean hasEphemerisData(int i);

    public abstract boolean usedInFix(int i);

    public static GnssStatusCompat wrap(GpsStatus gpsStatus) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GnssStatusCompat) ipChange.ipc$dispatch("21ef1d04", new Object[]{gpsStatus}) : new GpsStatusWrapper(gpsStatus);
    }
}
