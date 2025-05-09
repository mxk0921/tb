package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.FileEncodingType;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FileEncodingType f19212a = FileEncodingType.UTF8;
    public g1a<? super hd9, xhv> b;
    public g1a<? super bi8, xhv> c;

    static {
        t2o.a(1022361697);
    }

    public final FileEncodingType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileEncodingType) ipChange.ipc$dispatch("8ea0f7", new Object[]{this});
        }
        return this.f19212a;
    }

    public final g1a<hd9, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9e286f76", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<bi8, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.c;
    }

    public final void d(FileEncodingType fileEncodingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcc34cd", new Object[]{this, fileEncodingType});
            return;
        }
        ckf.g(fileEncodingType, "<set-?>");
        this.f19212a = fileEncodingType;
    }

    public final void e(g1a<? super hd9, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd83df8", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }

    public final void f(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }
}
