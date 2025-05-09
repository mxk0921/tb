package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteProcessListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k5j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299766);
    }

    public static MtopListener a(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopListener) ipChange.ipc$dispatch("fd43f4b5", new Object[]{mtopBusiness, mtopListener});
        }
        ArrayList arrayList = new ArrayList();
        if (mtopListener instanceof IRemoteProcessListener) {
            arrayList.add(MtopCallback.MtopProgressListener.class);
            arrayList.add(MtopCallback.MtopHeaderListener.class);
        }
        if ((mtopListener instanceof IRemoteCacheListener) || mtopBusiness.mtopProp.useCache) {
            arrayList.add(MtopCallback.MtopCacheListener.class);
        }
        if (mtopListener instanceof IMtopStreamListener) {
            arrayList.add(MtopCallback.MtopStreamListener.class);
        } else {
            arrayList.add(MtopCallback.MtopFinishListener.class);
        }
        return (MtopListener) Proxy.newProxyInstance(MtopListener.class.getClassLoader(), (Class[]) arrayList.toArray(new Class[arrayList.size()]), new j58(mtopBusiness, mtopListener));
    }
}
