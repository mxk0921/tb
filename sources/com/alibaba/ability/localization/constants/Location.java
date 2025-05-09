package com.alibaba.ability.localization.constants;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum Location {
    CN(o78.CHINA_MAINLAND),
    HK("HK"),
    MO("MO"),
    TW("TW"),
    SG("SG"),
    MY("MY"),
    CA("CA"),
    AU("AU"),
    NZ("NZ"),
    JP("JP"),
    KR("KR"),
    VN("VN"),
    TH("TH"),
    PH("PH"),
    KH("KH"),
    KZ("KZ"),
    UZ("UZ"),
    KG("KG"),
    MN("MN"),
    GE("GE"),
    GLOBAL("GLOBAL");
    
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "Location";
    private final String code;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(82837520);
        }

        public a() {
        }

        @JvmStatic
        public final Location a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Location) ipChange.ipc$dispatch("9999aeb1", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            try {
                return Location.valueOf(str);
            } catch (Exception e) {
                TLog.loge(Localization.LOG_MODULE, "Location", String.valueOf(e.getMessage()));
                return null;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    Location(String str) {
        this.code = str;
    }

    @JvmStatic
    public static final Location cast2Enum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Location) ipChange.ipc$dispatch("9999aeb1", new Object[]{str});
        }
        return Companion.a(str);
    }

    public static /* synthetic */ Object ipc$super(Location location, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/localization/constants/Location");
    }

    public static Location valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("5ae2ec65", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(Location.class, str);
        }
        return (Location) valueOf;
    }

    public final String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }
}
