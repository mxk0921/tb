package com.taobao.android.detail2.core.framework.data.net.prerequest;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.btm;
import tb.ddt;
import tb.ktm;
import tb.on8;
import tb.q0j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailRandomPreRequester extends NewDetailPreRequester {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class NDRandomRemoteBaseListener extends NewDetailPreRequester.NDRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321817);
        }

        public NDRandomRemoteBaseListener(on8 on8Var, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
            super(on8Var, preloadTaskEntity, map, ddtVar, str);
        }

        public static /* synthetic */ Object ipc$super(NDRandomRemoteBaseListener nDRandomRemoteBaseListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/net/prerequest/NewDetailRandomPreRequester$NDRandomRemoteBaseListener");
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester.NDRemoteBaseListener
        public NewDetailPreRequester.a generateDataProcessRunnable(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NewDetailPreRequester.a) ipChange.ipc$dispatch("54f596ce", new Object[]{this, mtopResponse});
            }
            return new a(mtopResponse, this.mPreloadtaskEntity, this.mId2CacheKeyMap, this.mTaskCallback, this.mTaskToken);
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester.NDRemoteBaseListener
        public String getRequestFailErrorCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a0373cfb", new Object[]{this});
            }
            return q0j.ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL_RANDOM;
        }
    }

    static {
        t2o.a(352321816);
    }

    public static /* synthetic */ Object ipc$super(NewDetailRandomPreRequester newDetailRandomPreRequester, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/net/prerequest/NewDetailRandomPreRequester");
    }

    @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester
    public NewDetailPreRequester.NDRemoteBaseListener e(on8 on8Var, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailPreRequester.NDRemoteBaseListener) ipChange.ipc$dispatch("dfe843a1", new Object[]{this, on8Var, preloadTaskEntity, map, ddtVar, str});
        }
        return new NDRandomRemoteBaseListener(on8Var, preloadTaskEntity, map, ddtVar, str);
    }

    @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f9c538", new Object[]{this});
        }
        return "ndPreRandom";
    }

    @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9087861", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35643a4f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends NewDetailPreRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321818);
        }

        public a(MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, ddt ddtVar, String str) {
            super(mtopResponse, preloadTaskEntity, map, ddtVar, str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/net/prerequest/NewDetailRandomPreRequester$RandomDataProcessRunnable");
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester.a
        public String f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8b41c5dc", new Object[]{this, str});
            }
            return str;
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester.a
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("27bf2452", new Object[]{this});
            }
            return q0j.ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT_RANDOM;
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester.a
        public void h(String str, JSONObject jSONObject, int i, ktm ktmVar, String str2, StringBuilder sb) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da4b2aff", new Object[]{this, str, jSONObject, new Integer(i), ktmVar, str2, sb});
                return;
            }
            for (String str3 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str3)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                    ktmVar.d(new btm.b().n("preload").l("low").m(str).o(jSONObject2).p(str2).k());
                    sb.append(str + str3);
                    sb.append(", ");
                    if (i2 == 0) {
                        c(jSONObject2);
                    }
                    i2++;
                }
            }
        }
    }
}
