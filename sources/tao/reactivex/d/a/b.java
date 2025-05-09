package tao.reactivex.d.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.r9y;
import tb.xxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum b implements xxx<Object> {
    INSTANCE,
    NEVER;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/a/b");
    }

    public static b valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c66bbbe", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(b.class, str);
        }
        return (b) valueOf;
    }

    @Override // tb.nzx
    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : i & 2;
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        }
    }

    @Override // tb.u7y
    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        return null;
    }

    @Override // tb.u7y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.u7y
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public static void a(Throwable th, r9y<?> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace4da7", new Object[]{th, r9yVar});
            return;
        }
        r9yVar.onSubscribe(INSTANCE);
        r9yVar.onError(th);
    }

    public static void a(r9y<?> r9yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{r9yVar});
            return;
        }
        r9yVar.onSubscribe(INSTANCE);
        r9yVar.onComplete();
    }

    @Override // tb.u7y
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called!");
    }
}
