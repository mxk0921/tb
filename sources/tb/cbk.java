package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import tb.uz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cbk extends WXSDKInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public uz.d m0;
    public a n0;
    public cnx o0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void r2(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2);
    }

    static {
        t2o.a(993002196);
    }

    public cbk(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(cbk cbkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/weex/NxWeexInstance");
    }

    public cnx D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnx) ipChange.ipc$dispatch("27af6153", new Object[]{this});
        }
        return this.o0;
    }

    public a E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3791f5c1", new Object[]{this});
        }
        return this.n0;
    }

    public void F1(cnx cnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61f287d", new Object[]{this, cnxVar});
        } else {
            this.o0 = cnxVar;
        }
    }

    public void G1(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f89cd3f", new Object[]{this, aVar});
        } else {
            this.n0 = aVar;
        }
    }

    public void H1(uz.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1588dba", new Object[]{this, dVar});
        } else {
            this.m0 = dVar;
        }
    }
}
