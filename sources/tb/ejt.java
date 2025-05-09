package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ejt extends hu1<TemplateInfo> implements uzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705471);
        t2o.a(511705367);
    }

    public static /* synthetic */ Object ipc$super(ejt ejtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/TemplateInfoEditorImpl");
    }

    @Override // tb.uzd
    public TemplateInfo f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateInfo) ipChange.ipc$dispatch("3c4f7732", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.uzd
    public void j(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af2aecc", new Object[]{this, templateInfo});
            return;
        }
        t();
        g().b(templateInfo.clone());
    }

    @Override // tb.uzd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704b93c", new Object[]{this});
            return;
        }
        t();
        g().b(null);
    }
}
