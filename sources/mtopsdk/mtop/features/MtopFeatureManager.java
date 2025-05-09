package mtopsdk.mtop.features;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MtopFeatureManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopFeatureManager";

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.mtop.features.MtopFeatureManager$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum;

        static {
            int[] iArr = new int[MtopFeatureEnum.values().length];
            $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum = iArr;
            try {
                iArr[MtopFeatureEnum.SUPPORT_RELATIVE_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[MtopFeatureEnum.UNIT_INFO_FEATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[MtopFeatureEnum.DISABLE_WHITEBOX_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[MtopFeatureEnum.SUPPORT_UTDID_UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[MtopFeatureEnum.DISABLE_X_COMMAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[MtopFeatureEnum.SUPPORT_OPEN_ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum MtopFeatureEnum {
        SUPPORT_RELATIVE_URL(1),
        UNIT_INFO_FEATURE(2),
        DISABLE_WHITEBOX_SIGN(3),
        SUPPORT_UTDID_UNIT(4),
        DISABLE_X_COMMAND(5),
        SUPPORT_OPEN_ACCOUNT(6);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long feature;

        MtopFeatureEnum(long j) {
            this.feature = j;
        }

        public static /* synthetic */ Object ipc$super(MtopFeatureEnum mtopFeatureEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/features/MtopFeatureManager$MtopFeatureEnum");
        }

        public static MtopFeatureEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopFeatureEnum) ipChange.ipc$dispatch("f4c23a1a", new Object[]{str});
            }
            return (MtopFeatureEnum) Enum.valueOf(MtopFeatureEnum.class, str);
        }

        public long getFeature() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c34bdb3b", new Object[]{this})).longValue();
            }
            return this.feature;
        }
    }

    static {
        t2o.a(589299917);
    }

    public static int getMtopFeatureByFeatureEnum(MtopFeatureEnum mtopFeatureEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30999b1f", new Object[]{mtopFeatureEnum})).intValue();
        }
        if (mtopFeatureEnum == null) {
            return 0;
        }
        switch (AnonymousClass1.$SwitchMap$mtopsdk$mtop$features$MtopFeatureManager$MtopFeatureEnum[mtopFeatureEnum.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static long getMtopFeatureValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1775d577", new Object[]{new Integer(i)})).longValue();
        }
        if (i < 1) {
            return 0L;
        }
        return 1 << (i - 1);
    }

    public static long getMtopTotalFeatures(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("788adb97", new Object[]{mtop})).longValue();
        }
        if (mtop == null) {
            mtop = Mtop.instance(null);
        }
        long j = 0;
        try {
            for (Integer num : mtop.getMtopConfig().mtopFeatures) {
                j |= getMtopFeatureValue(num.intValue());
            }
        } catch (Exception e) {
            TBSdkLog.w(TAG, mtop.getInstanceId() + " [getMtopTotalFeatures] get mtop total features error.---" + e.toString());
        }
        return j;
    }

    public static void setMtopFeatureFlag(Mtop mtop, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfeaa29", new Object[]{mtop, new Integer(i), new Boolean(z)});
            return;
        }
        if (mtop == null) {
            mtop = Mtop.instance(null);
        }
        Set<Integer> set = mtop.getMtopConfig().mtopFeatures;
        if (z) {
            set.add(Integer.valueOf(i));
        } else {
            set.remove(Integer.valueOf(i));
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtop.getInstanceId() + " [setMtopFeatureFlag] set feature=" + i + " , openFlag=" + z);
        }
    }
}
