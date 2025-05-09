package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderEnvironment;
import com.uploader.export.IUploaderLog;
import com.uploader.export.UploaderGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pmv implements w6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context d;

    /* renamed from: a  reason: collision with root package name */
    public final IUploaderEnvironment f26190a;
    public final IUploaderLog b;
    public final y6e c;

    public pmv() {
        this(null, new rmv(UploaderGlobal.f()), new umv(), new wmv());
    }

    @Override // tb.w6e
    public y6e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6e) ipChange.ipc$dispatch("97153f5f", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.w6e
    public IUploaderEnvironment getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploaderEnvironment) ipChange.ipc$dispatch("cddd803d", new Object[]{this});
        }
        return this.f26190a;
    }

    @Override // tb.w6e
    public IUploaderLog getLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploaderLog) ipChange.ipc$dispatch("8598b99b", new Object[]{this});
        }
        return this.b;
    }

    public pmv(Context context) {
        this(context, new rmv(context), new umv(), new wmv());
    }

    public pmv(Context context, IUploaderEnvironment iUploaderEnvironment) {
        this(context, iUploaderEnvironment, new umv(), new wmv());
    }

    public pmv(Context context, IUploaderEnvironment iUploaderEnvironment, IUploaderLog iUploaderLog, y6e y6eVar) {
        if (context == null) {
            d = UploaderGlobal.f();
        } else {
            d = context;
        }
        this.f26190a = iUploaderEnvironment;
        this.b = iUploaderLog;
        this.c = y6eVar;
    }
}
