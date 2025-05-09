package tb;

import android.content.Context;
import com.alibaba.android.split.manager.IPluginContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l8m implements IPluginContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23175a;
    public IPluginContext.Status b;
    public final File c;
    public final jcq d;
    public final String e;

    static {
        t2o.a(677380196);
        t2o.a(676331636);
    }

    public l8m(String str, File file, jcq jcqVar) {
        IPluginContext.Status status = IPluginContext.Status.VERIFIED;
        this.b = status;
        this.f23175a = str;
        this.c = file;
        this.d = jcqVar;
        this.b = jcqVar.r(str) ? IPluginContext.Status.EMULATED : status;
        this.e = jcqVar.n();
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public void a(IPluginContext.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719deb9b", new Object[]{this, status});
            return;
        }
        if (status.ordinal() > IPluginContext.Status.VERIFIED.ordinal()) {
            this.d.y(this.f23175a);
        }
        this.b = status;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba146f05", new Object[]{this})).booleanValue();
        }
        if (this.b.ordinal() > IPluginContext.Status.EMULATED.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("55f92741", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32777502", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a19d826", new Object[]{this})).booleanValue();
        }
        if (this.b.ordinal() > IPluginContext.Status.VERIFIED.ordinal()) {
            return true;
        }
        return false;
    }

    public boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b1971c8", new Object[]{this, context})).booleanValue();
        }
        try {
            r8o.i().d(context, this.c.getAbsolutePath());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
