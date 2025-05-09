package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderEnvironment;
import com.uploader.export.UploaderGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class qmv implements IUploaderEnvironment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f26831a;

    public qmv(int i) {
        this.f26831a = i;
    }

    public xg8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg8) ipChange.ipc$dispatch("fda7eab4", new Object[]{this});
        }
        return UploaderGlobal.b(getEnvironment(), getInstanceType());
    }

    @Override // com.uploader.export.IUploaderEnvironment
    @Deprecated
    public final String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return a().b;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    @Deprecated
    public final String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return a().c;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public final int getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a67e1df", new Object[]{this})).intValue();
        }
        return this.f26831a;
    }
}
