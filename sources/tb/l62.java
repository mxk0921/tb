package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l62 extends hu1<Beauty> implements xib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705462);
        t2o.a(511705352);
    }

    public static /* synthetic */ Object ipc$super(l62 l62Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/BeautyEditorImpl");
    }

    @Override // tb.xib
    public void e0(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fdddb6", new Object[]{this, beauty});
            return;
        }
        t();
        g().b(beauty.clone());
    }

    @Override // tb.xib
    public Beauty n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Beauty) ipChange.ipc$dispatch("d9f08c6e", new Object[]{this});
        }
        return g().a().get();
    }
}
