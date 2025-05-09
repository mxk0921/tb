package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fda;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GnssStatusWrapper extends GnssStatusCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GnssStatus mWrapped;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static float getCarrierFrequencyHz(GnssStatus gnssStatus, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a8724f78", new Object[]{gnssStatus, new Integer(i)})).floatValue();
            }
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        public static boolean hasCarrierFrequencyHz(GnssStatus gnssStatus, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dc1df8d0", new Object[]{gnssStatus, new Integer(i)})).booleanValue();
            }
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static float getBasebandCn0DbHz(GnssStatus gnssStatus, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6e01c025", new Object[]{gnssStatus, new Integer(i)})).floatValue();
            }
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        public static boolean hasBasebandCn0DbHz(GnssStatus gnssStatus, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9c043d75", new Object[]{gnssStatus, new Integer(i)})).booleanValue();
            }
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public GnssStatusWrapper(Object obj) {
        this.mWrapped = fda.a(Preconditions.checkNotNull(fda.a(obj)));
    }

    public static /* synthetic */ Object ipc$super(GnssStatusWrapper gnssStatusWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/location/GnssStatusWrapper");
    }

    public boolean equals(Object obj) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GnssStatusWrapper)) {
            return false;
        }
        equals = this.mWrapped.equals(((GnssStatusWrapper) obj).mWrapped);
        return equals;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        float azimuthDegrees;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e0308db", new Object[]{this, new Integer(i)})).floatValue();
        }
        azimuthDegrees = this.mWrapped.getAzimuthDegrees(i);
        return azimuthDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abc5bb93", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getBasebandCn0DbHz(this.mWrapped, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8376fb60", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getCarrierFrequencyHz(this.mWrapped, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        float cn0DbHz;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc9b99ed", new Object[]{this, new Integer(i)})).floatValue();
        }
        cn0DbHz = this.mWrapped.getCn0DbHz(i);
        return cn0DbHz;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        int constellationType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2b462b8", new Object[]{this, new Integer(i)})).intValue();
        }
        constellationType = this.mWrapped.getConstellationType(i);
        return constellationType;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        float elevationDegrees;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43a2a5cc", new Object[]{this, new Integer(i)})).floatValue();
        }
        elevationDegrees = this.mWrapped.getElevationDegrees(i);
        return elevationDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int satelliteCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c2ca104", new Object[]{this})).intValue();
        }
        satelliteCount = this.mWrapped.getSatelliteCount();
        return satelliteCount;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        int svid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dba4689b", new Object[]{this, new Integer(i)})).intValue();
        }
        svid = this.mWrapped.getSvid(i);
        return svid;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        boolean hasAlmanacData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed309ff", new Object[]{this, new Integer(i)})).booleanValue();
        }
        hasAlmanacData = this.mWrapped.hasAlmanacData(i);
        return hasAlmanacData;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("788d8bb0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasCarrierFrequencyHz(this.mWrapped, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        boolean hasEphemerisData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82711af4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        hasEphemerisData = this.mWrapped.hasEphemerisData(i);
        return hasEphemerisData;
    }

    public int hashCode() {
        int hashCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        hashCode = this.mWrapped.hashCode();
        return hashCode;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        boolean usedInFix;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d95fb44d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        usedInFix = this.mWrapped.usedInFix(i);
        return usedInFix;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4774eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.hasBasebandCn0DbHz(this.mWrapped, i);
        }
        return false;
    }
}
