package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.listener.MtopCacheListenerImpl;
import com.taobao.tao.remotebusiness.listener.MtopFinishListenerImpl;
import com.taobao.tao.remotebusiness.listener.MtopProgressListenerImpl;
import com.taobao.tao.remotebusiness.listener.MtopStreamListenerImpl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import mtopsdk.mtop.common.MtopListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j58 implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopFinishListenerImpl f21765a;
    public MtopProgressListenerImpl b;
    public MtopCacheListenerImpl c;
    public MtopStreamListenerImpl d;
    public final MtopBusiness e;
    public final MtopListener f;

    static {
        t2o.a(589299762);
    }

    public j58(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        this.f21765a = new MtopFinishListenerImpl(mtopBusiness, mtopListener);
        this.e = mtopBusiness;
        this.f = mtopListener;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        name.hashCode();
        MtopListener mtopListener = this.f;
        MtopBusiness mtopBusiness = this.e;
        char c = 65535;
        switch (name.hashCode()) {
            case -1809154262:
                if (name.equals(Constants.KEY_DATA_RECEIVED_TIME)) {
                    c = 0;
                    break;
                }
                break;
            case -1624820274:
                if (name.equals("onReceiveData")) {
                    c = 1;
                    break;
                }
                break;
            case 1030363105:
                if (name.equals("onCached")) {
                    c = 2;
                    break;
                }
                break;
            case 1123967826:
                if (name.equals("onFinish")) {
                    c = 3;
                    break;
                }
                break;
            case 1177139532:
                if (name.equals("onHeader")) {
                    c = 4;
                    break;
                }
                break;
            case 2096292721:
                if (name.equals("onFinished")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
                if (this.b == null) {
                    this.b = new MtopProgressListenerImpl(mtopBusiness, mtopListener);
                }
                return method.invoke(this.b, objArr);
            case 1:
            case 3:
                if (this.d == null) {
                    this.d = new MtopStreamListenerImpl(mtopBusiness, mtopListener);
                }
                return method.invoke(this.d, objArr);
            case 2:
                if (this.c == null) {
                    this.c = new MtopCacheListenerImpl(mtopBusiness, mtopListener);
                }
                return method.invoke(this.c, objArr);
            case 5:
                return method.invoke(this.f21765a, objArr);
            default:
                return null;
        }
    }
}
