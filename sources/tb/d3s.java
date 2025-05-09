package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d3s implements wvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "taolive";

    static {
        t2o.a(779092277);
        t2o.a(806355885);
    }

    @Override // tb.wvd
    public Object a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42964447", new Object[]{this, context, str});
        }
        try {
            op opVar = new op();
            opVar.f25538a = Long.valueOf(sbt.a());
            fdb w = AVFSCacheManager.getInstance().cacheForModule("taolive").Z(context.getClassLoader()).L(opVar).w();
            if (w == null) {
                return null;
            }
            return w.d0(str);
        } catch (Exception e) {
            Log.e("TLiveCacheAdapter", "readData", e);
            return null;
        }
    }

    @Override // tb.wvd
    public boolean b(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d7b4c2", new Object[]{this, context, str, obj})).booleanValue();
        }
        try {
            op opVar = new op();
            opVar.f25538a = Long.valueOf(sbt.a());
            return AVFSCacheManager.getInstance().cacheForModule("taolive").Z(context.getClassLoader()).L(opVar).w().N(str, obj);
        } catch (Exception e) {
            Log.e("TLiveCacheAdapter", "writeData", e);
            return false;
        }
    }
}
