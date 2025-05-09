package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GpsStatusWrapper extends GnssStatusCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;
    private Iterator<GpsSatellite> mCachedIterator;
    private final GpsStatus mWrapped;
    private int mCachedSatelliteCount = -1;
    private int mCachedIteratorPosition = -1;
    private GpsSatellite mCachedSatellite = null;

    public GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mWrapped = gpsStatus2;
        this.mCachedIterator = gpsStatus2.getSatellites().iterator();
    }

    private static int getConstellationFromPrn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("935f0caa", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i > 200 && i <= 235) {
            return 5;
        }
        if (i < QZSS_SVID_MIN || i > 200) {
            return 0;
        }
        return 4;
    }

    private GpsSatellite getSatellite(int i) {
        GpsSatellite gpsSatellite;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GpsSatellite) ipChange.ipc$dispatch("7ad3847d", new Object[]{this, new Integer(i)});
        }
        synchronized (this.mWrapped) {
            try {
                if (i < this.mCachedIteratorPosition) {
                    this.mCachedIterator = this.mWrapped.getSatellites().iterator();
                    this.mCachedIteratorPosition = -1;
                }
                while (true) {
                    int i2 = this.mCachedIteratorPosition;
                    if (i2 >= i) {
                        break;
                    }
                    this.mCachedIteratorPosition = i2 + 1;
                    if (!this.mCachedIterator.hasNext()) {
                        this.mCachedSatellite = null;
                        break;
                    }
                    this.mCachedSatellite = this.mCachedIterator.next();
                }
                gpsSatellite = this.mCachedSatellite;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f436741", new Object[]{new Integer(i)})).intValue();
        }
        int constellationFromPrn = getConstellationFromPrn(i);
        if (constellationFromPrn == 2) {
            return i + 87;
        }
        if (constellationFromPrn == 3) {
            return i - 64;
        }
        if (constellationFromPrn != 5) {
            return i;
        }
        return i - 200;
    }

    public static /* synthetic */ Object ipc$super(GpsStatusWrapper gpsStatusWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/location/GpsStatusWrapper");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsStatusWrapper)) {
            return false;
        }
        return this.mWrapped.equals(((GpsStatusWrapper) obj).mWrapped);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e0308db", new Object[]{this, new Integer(i)})).floatValue();
        }
        return getSatellite(i).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abc5bb93", new Object[]{this, new Integer(i)})).floatValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8376fb60", new Object[]{this, new Integer(i)})).floatValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc9b99ed", new Object[]{this, new Integer(i)})).floatValue();
        }
        return getSatellite(i).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2b462b8", new Object[]{this, new Integer(i)})).intValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return getConstellationFromPrn(getSatellite(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43a2a5cc", new Object[]{this, new Integer(i)})).floatValue();
        }
        return getSatellite(i).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c2ca104", new Object[]{this})).intValue();
        }
        synchronized (this.mWrapped) {
            try {
                if (this.mCachedSatelliteCount == -1) {
                    for (GpsSatellite gpsSatellite : this.mWrapped.getSatellites()) {
                        this.mCachedSatelliteCount++;
                    }
                    this.mCachedSatelliteCount++;
                }
                i = this.mCachedSatelliteCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dba4689b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return getSatellite(i).getPrn();
        }
        return getSvidFromPrn(getSatellite(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed309ff", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return getSatellite(i).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("788d8bb0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82711af4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return getSatellite(i).hasEphemeris();
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d95fb44d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return getSatellite(i).usedInFix();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4774eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }
}
