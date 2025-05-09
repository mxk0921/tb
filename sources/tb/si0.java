package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class si0 extends hu1<AiQuality> implements ueb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705460);
        t2o.a(511705351);
    }

    public static /* synthetic */ Object ipc$super(si0 si0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/AiQualityEditorImpl");
    }

    @Override // tb.ueb
    public AiQuality I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AiQuality) ipChange.ipc$dispatch("4910c222", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.ueb
    public void a0(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b31050", new Object[]{this, aiQuality});
            return;
        }
        t();
        g().b(aiQuality.clone());
    }

    @Override // tb.ueb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a27f71", new Object[]{this});
            return;
        }
        t();
        g().b(null);
    }
}
