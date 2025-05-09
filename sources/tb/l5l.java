package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.ultron.event.model.OpenUrlEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l5l extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_H5_RESULT = "data";
    public static final String KEY_OPEN_URL_EVENT = "openUrlEvent";
    public static final String KEY_OPEN_URL_PARAMS = "params";
    public static final String KEY_REQUEST_CODE = "activityRequestCode";
    public static final String KEY_RESULT_CODE = "activityResultCode";
    public static final String KEY_RESULT_DATA = "activityResultData";
    public Intent j;
    public gsb k;

    static {
        t2o.a(157286523);
    }

    public static /* synthetic */ Object ipc$super(l5l l5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/OpenUrlResultSubscriber");
    }

    public final JSONObject A(Intent intent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f817db7b", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Set<String> keySet = extras.keySet();
        JSONObject jSONObject = new JSONObject();
        if (keySet != null) {
            for (String str : keySet) {
                if (!TextUtils.isEmpty(str) && (obj = extras.get(str)) != null) {
                    jSONObject.put(str, (Object) String.valueOf(obj));
                }
            }
        }
        return jSONObject;
    }

    public void x(Intent intent, int i) {
        OpenUrlEventModel openUrlEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1357ed", new Object[]{this, intent, new Integer(i)});
        } else if (i == -1 && intent != null && (openUrlEventModel = (OpenUrlEventModel) JSON.parseObject(this.k.getFields().toJSONString(), OpenUrlEventModel.class)) != null) {
            JSONObject params = openUrlEventModel.getParams();
            if (params == null) {
                params = new JSONObject();
            }
            String stringExtra = intent.getStringExtra("data");
            if (stringExtra == null) {
                this.c.a(this.e);
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(stringExtra);
                if (parseObject != null) {
                    v(parseObject);
                    params.putAll(parseObject);
                }
            } catch (Exception e) {
                UnifyLog.m(this.d.getBizName(), "OpenUrlResultSubscriber", "handleH5Result", "h5转化json失败: ".concat(stringExtra));
                lbq.c(this.d.getBizName(), "OpenUrlResultSubscriber.handleH5Result", e);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) params);
            w(this.k, jSONObject);
            this.c.a(this.e);
        }
    }

    public void y(Intent intent, int i) {
        OpenUrlEventModel openUrlEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc6463", new Object[]{this, intent, new Integer(i)});
        } else if (i == -1 && intent != null) {
            JSONObject A = A(intent);
            try {
                openUrlEventModel = (OpenUrlEventModel) JSON.parseObject(this.k.getFields().toJSONString(), OpenUrlEventModel.class);
            } catch (Exception e) {
                lbq.c(this.d.getBizName(), "OpenUrlResultSubscriber.handleNativeResult", e);
                openUrlEventModel = null;
            }
            if (openUrlEventModel != null) {
                JSONObject params = openUrlEventModel.getParams();
                params.putAll(A);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params", (Object) params);
                w(this.k, jSONObject);
                this.c.a(this.e);
            }
        }
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e955b5d", new Object[]{this})).booleanValue();
        }
        int intValue = ((Integer) g("activityRequestCode")).intValue();
        this.j = (Intent) g("activityResultData");
        b8v b8vVar = (b8v) g("openUrlEvent");
        if (this.e == null || b8vVar == null) {
            return false;
        }
        int intValue2 = ((Integer) b8vVar.i("activityRequestCode")).intValue();
        gsb gsbVar = (gsb) b8vVar.f();
        this.k = gsbVar;
        if (gsbVar == null) {
            return false;
        }
        return intValue == intValue2 && gsbVar.getFields() != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r3.equals("H5") == false) goto L_0x0052;
     */
    @Override // tb.l6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(tb.b8v r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.l5l.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "827a7510"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r0] = r8
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            boolean r8 = r7.z()
            if (r8 != 0) goto L_0x001c
            return
        L_0x001c:
            java.lang.String r8 = "activityResultCode"
            java.lang.Object r8 = r7.g(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            tb.gsb r3 = r7.k
            com.alibaba.fastjson.JSONObject r3 = r3.getFields()
            java.lang.String r3 = r3.toJSONString()
            java.lang.Class<com.alibaba.android.ultron.event.model.OpenUrlEventModel> r4 = com.alibaba.android.ultron.event.model.OpenUrlEventModel.class
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parseObject(r3, r4)
            com.alibaba.android.ultron.event.model.OpenUrlEventModel r3 = (com.alibaba.android.ultron.event.model.OpenUrlEventModel) r3
            java.lang.String r3 = r3.getPageType()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0045
            return
        L_0x0045:
            r3.hashCode()
            java.lang.String r4 = "OpenUrlResultSubscriber"
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -1968751561: goto L_0x0068;
                case 2285: goto L_0x005f;
                case 2692129: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            r0 = -1
            goto L_0x0072
        L_0x0054:
            java.lang.String r0 = "Weex"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005d
            goto L_0x0052
        L_0x005d:
            r0 = 2
            goto L_0x0072
        L_0x005f:
            java.lang.String r1 = "H5"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x0052
        L_0x0068:
            java.lang.String r0 = "Native"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0052
        L_0x0071:
            r0 = 0
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0085;
                case 2: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00ac
        L_0x0076:
            tb.fsb r8 = r7.d
            java.lang.String r8 = r8.getBizName()
            java.lang.String r0 = "从weex页面跳回"
            java.lang.String[] r1 = new java.lang.String[r2]
            com.taobao.android.ultron.common.utils.UnifyLog.m(r8, r4, r0, r1)
            goto L_0x00ac
        L_0x0085:
            tb.fsb r0 = r7.d
            java.lang.String r0 = r0.getBizName()
            java.lang.String r1 = "从H5页面跳回"
            java.lang.String[] r2 = new java.lang.String[r2]
            com.taobao.android.ultron.common.utils.UnifyLog.m(r0, r4, r1, r2)
            android.content.Intent r0 = r7.j
            r7.x(r0, r8)
            goto L_0x00ac
        L_0x0099:
            tb.fsb r0 = r7.d
            java.lang.String r0 = r0.getBizName()
            java.lang.String r1 = "从native页面跳回"
            java.lang.String[] r2 = new java.lang.String[r2]
            com.taobao.android.ultron.common.utils.UnifyLog.m(r0, r4, r1, r2)
            android.content.Intent r0 = r7.j
            r7.y(r0, r8)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l5l.t(tb.b8v):void");
    }
}
