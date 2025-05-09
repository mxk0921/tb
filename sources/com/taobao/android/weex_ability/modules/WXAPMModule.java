package com.taobao.android.weex_ability.modules;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceStatus;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import tb.l2o;
import tb.t2o;
import tb.v3x;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXAPMModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"onStage", "addProperty", l2o.COL_MARK};
    public static final String NAME = "apm";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/modules/WXAPMModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXAPMModule.access$000(WXAPMModule.this, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public b(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/modules/WXAPMModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXAPMModule.access$100(WXAPMModule.this, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;

        public c(String str, JSONObject jSONObject) {
            this.d = str;
            this.e = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/modules/WXAPMModule$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXAPMModule.access$200(WXAPMModule.this, this.d, this.e);
            }
        }
    }

    public static /* synthetic */ void access$000(WXAPMModule wXAPMModule, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d7a02d", new Object[]{wXAPMModule, str, str2});
        } else {
            wXAPMModule.onStage(str, str2);
        }
    }

    public static /* synthetic */ void access$100(WXAPMModule wXAPMModule, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f259680c", new Object[]{wXAPMModule, str, str2});
        } else {
            wXAPMModule.addProperty(str, str2);
        }
    }

    public static /* synthetic */ void access$200(WXAPMModule wXAPMModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed90eaf", new Object[]{wXAPMModule, str, jSONObject});
        } else {
            wXAPMModule.mark(str, jSONObject);
        }
    }

    private void addProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11efdb1", new Object[]{this, str, str2});
            return;
        }
        WMInstanceApm apm = getApm();
        if (apm != null) {
            apm.b(str, str2);
            if (apm.e() != null) {
                apm.e().a(str, str2);
            }
        }
    }

    public static long generateUptimeFromCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
        }
        return 0L;
    }

    private WMInstanceApm getApm() {
        v3x v3xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WMInstanceApm) ipChange.ipc$dispatch("35897668", new Object[]{this});
        }
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
        if (weexInstanceImpl == null || weexInstanceImpl.getInstanceStatus() == WeexInstanceStatus.DESTROYED || (v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class)) == null) {
            return null;
        }
        return v3xVar.c();
    }

    public static /* synthetic */ Object ipc$super(WXAPMModule wXAPMModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/modules/WXAPMModule");
    }

    private void mark(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17eed12", new Object[]{this, str, jSONObject});
            return;
        }
        WMInstanceApm apm = getApm();
        if (apm != null) {
            apm.a(str, jSONObject);
            if (apm.e() != null) {
                apm.e().d(getWeexInstance().getInstanceId(), str, jSONObject);
            }
        }
    }

    private void onStage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cfcf7a", new Object[]{this, str, str2});
            return;
        }
        WMInstanceApm apm = getApm();
        if (apm != null) {
            long generateUptimeFromCurrentTime = generateUptimeFromCurrentTime((long) Double.parseDouble(str2));
            apm.c(str, generateUptimeFromCurrentTime);
            apm.i(getWeexInstance().getInstanceId(), str, generateUptimeFromCurrentTime);
        }
    }

    static {
        t2o.a(980418623);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        str2.hashCode();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1967421034:
                if (str2.equals("addProperty")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1336895393:
                if (str2.equals("onStage")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3344077:
                if (str2.equals(l2o.COL_MARK)) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                argCount(weexValueArr, 2);
                executeInMain(new b(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull()));
                return null;
            case 1:
                argCount(weexValueArr, 2);
                executeInMain(new a(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull()));
                return null;
            case 2:
                argCount(weexValueArr, 2);
                executeInMain(new c(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toJSONObjectOrNull()));
                return null;
            default:
                return null;
        }
    }
}
