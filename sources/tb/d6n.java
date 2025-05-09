package tb;

import com.alibaba.ut.abtest.internal.util.ClassUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d6n implements c6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ezu f17622a;

    static {
        t2o.a(961544430);
        t2o.a(961544429);
    }

    public final ezu a() {
        ezu ezuVar = this.f17622a;
        if (ezuVar != null) {
            return ezuVar;
        }
        Class<?> b = ClassUtils.b(m.PUSHCLIENT_CLASSNAME, null);
        if (b == null) {
            return null;
        }
        try {
            ezu ezuVar2 = (ezu) b.newInstance();
            this.f17622a = ezuVar2;
            return ezuVar2;
        } catch (Exception e) {
            ogh.h("PushServiceImpl", e.getMessage(), e);
            return null;
        }
    }

    @Override // tb.c6n
    public void cancelSyncCrowd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07a99ff", new Object[]{this});
            return;
        }
        ogh.e("PushServiceImpl", "cancelSyncCrowd");
        ezu ezuVar = this.f17622a;
        if (ezuVar != null) {
            ezuVar.cancelSyncCrowd();
        }
    }

    @Override // tb.c6n
    public void syncExperiments(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2daadc", new Object[]{this, new Boolean(z), str});
            return;
        }
        if (z) {
            ogh.f("PushServiceImpl", "【实验数据】开始强制更新实验数据。");
        } else {
            ogh.f("PushServiceImpl", "【实验数据】开始更新实验数据。");
        }
        ezu ezuVar = this.f17622a;
        if (ezuVar != null) {
            ezuVar.syncExperiments(z, str);
        }
    }

    @Override // tb.c6n
    public boolean destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0306f9f", new Object[]{this})).booleanValue();
        }
        ogh.e("PushServiceImpl", "unbindService.");
        synchronized (d6n.class) {
            try {
                ezu ezuVar = this.f17622a;
                if (ezuVar != null) {
                    ezuVar.destory();
                    this.f17622a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // tb.c6n
    public boolean isCrowd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8f53f8", new Object[]{this, str})).booleanValue();
        }
        ogh.e("PushServiceImpl", "isCrowd. pushClient=" + this.f17622a + ", crowdId=" + str);
        ezu ezuVar = this.f17622a;
        if (ezuVar != null) {
            return ezuVar.isCrowd(str);
        }
        return false;
    }

    @Override // tb.c6n
    public boolean initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b11081b", new Object[]{this})).booleanValue();
        }
        ogh.e("PushServiceImpl", "initialize.");
        try {
            a();
            ezu ezuVar = this.f17622a;
            if (ezuVar == null) {
                return false;
            }
            ezuVar.initialize();
            return true;
        } catch (Exception e) {
            ku0.j("PushServiceImpl.initialize", e);
            return false;
        }
    }
}
