package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.request.BasicRequest;
import com.taobao.tao.util.TaoHelper;
import java.io.Serializable;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Application mApplication;
    public RemoteBusiness mRemoteBusiness;
    public IRemoteBaseListener mRequestListener;

    static {
        t2o.a(764412109);
    }

    public x32(Application application) {
        this.mApplication = application;
    }

    public static int getRequestType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("858c5f77", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void putJson(com.taobao.tao.request.BasicRequest r7, mtopsdk.mtop.domain.MtopRequest r8) {
        /*
            r6 = this;
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            java.lang.String r1 = r8.getData()
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)
            r2 = 0
        L_0x0011:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0083
            r3 = r0[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "VERSION"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "API_NAME"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "NEED_ECODE"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "$"
            int r4 = r3.indexOf(r4)
            r5 = -1
            if (r4 != r5) goto L_0x0072
            java.lang.String r4 = "NEED_SESSION"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "serialVersionUID"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "ORIGINALJSON"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x0072
            r4 = r0[r2]     // Catch: IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x0063, SecurityException -> 0x0065
            r5 = 1
            r4.setAccessible(r5)     // Catch: IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x0063, SecurityException -> 0x0065
            r4 = r0[r2]     // Catch: IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x0063, SecurityException -> 0x0065
            java.lang.Object r4 = r4.get(r7)     // Catch: IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x0063, SecurityException -> 0x0065
            goto L_0x0073
        L_0x0061:
            r4 = move-exception
            goto L_0x0067
        L_0x0063:
            r4 = move-exception
            goto L_0x006b
        L_0x0065:
            r4 = move-exception
            goto L_0x006f
        L_0x0067:
            r4.printStackTrace()
            goto L_0x0072
        L_0x006b:
            r4.printStackTrace()
            goto L_0x0072
        L_0x006f:
            r4.printStackTrace()
        L_0x0072:
            r4 = 0
        L_0x0073:
            if (r4 == 0) goto L_0x0080
            r1.put(r3, r4)     // Catch: all -> 0x0079
            goto L_0x0080
        L_0x0079:
            java.lang.String r3 = "ReflectUtil:"
            java.lang.String r4 = "convert() addDataParam exception."
            tb.y7t.a(r3, r4)
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0083:
            java.lang.String r7 = r1.toString()
            r8.setData(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x32.putJson(com.taobao.tao.request.BasicRequest, mtopsdk.mtop.domain.MtopRequest):void");
    }

    public void cancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mRemoteBusiness = null;
        this.mRequestListener = null;
        this.mApplication = null;
    }

    public boolean isRequestCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11dbc349", new Object[]{this})).booleanValue();
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness != null) {
            return remoteBusiness.isTaskCanceled();
        }
        return true;
    }

    public void setRemoteBaseListener(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca8e2", new Object[]{this, iRemoteBaseListener});
        } else {
            this.mRequestListener = iRemoteBaseListener;
        }
    }

    public void startRequest(Object obj, int i, Object obj2, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203445ae", new Object[]{this, obj, new Integer(i), obj2, cls});
        } else if (obj2 instanceof IMTOPDataObject) {
            BasicRequest basicRequest = (BasicRequest) obj2;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(basicRequest.getAPI_NAME());
            mtopRequest.setVersion(basicRequest.getVERSION());
            mtopRequest.setNeedEcode(basicRequest.isNEED_ECODE());
            if (basicRequest.getSid() != null) {
                mtopRequest.setNeedSession(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sid", (Object) basicRequest.getSid());
                mtopRequest.setData(jSONObject.toString());
            }
            putJson(basicRequest, mtopRequest);
            RemoteBusiness bizId = RemoteBusiness.build((Context) this.mApplication, mtopRequest, TaoHelper.getTTID()).reqContext(obj).setBizId(90);
            this.mRemoteBusiness = bizId;
            bizId.setJsonType(JsonTypeEnum.ORIGINALJSON);
            this.mRemoteBusiness.registeListener((IRemoteListener) this.mRequestListener).startRequest(i, cls);
        }
    }

    public void startRequest(Object obj, int i, Object obj2, Class<?> cls, Map<String, Serializable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8fc417", new Object[]{this, obj, new Integer(i), obj2, cls, map});
        } else if (obj2 instanceof BasicRequest) {
            BasicRequest basicRequest = (BasicRequest) obj2;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(basicRequest.getAPI_NAME());
            mtopRequest.setVersion(basicRequest.getVERSION());
            mtopRequest.setNeedEcode(basicRequest.isNEED_ECODE());
            mtopRequest.setNeedSession(basicRequest.isNEED_SESSION());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sid", (Object) Login.getSid());
            mtopRequest.setData(jSONObject.toString());
            putJson(basicRequest, mtopRequest);
            if (map != null) {
                JSONObject parseObject = JSON.parseObject(mtopRequest.getData());
                for (Map.Entry<String, Serializable> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        parseObject.put(entry.getKey(), (Object) entry.getValue().toString());
                    }
                }
                mtopRequest.setData(parseObject.toString());
            }
            RemoteBusiness bizId = RemoteBusiness.build((Context) this.mApplication, mtopRequest, TaoHelper.getTTID()).reqContext(obj).setBizId(90);
            this.mRemoteBusiness = bizId;
            bizId.setJsonType(JsonTypeEnum.ORIGINALJSON);
            this.mRemoteBusiness.registeListener((IRemoteListener) this.mRequestListener).startRequest(i, cls);
        }
    }
}
