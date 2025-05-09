package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import java.io.File;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dwf extends pwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final File b;

    static {
        t2o.a(615514208);
    }

    public dwf(File file) {
        super("");
        this.b = file;
    }

    public static /* synthetic */ Object ipc$super(dwf dwfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -64392822) {
            return super.a();
        }
        if (hashCode == 1151109534) {
            return super.b();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/diagnose/scene/engine/reader/JsonFileRuleDefineReader");
    }

    @Override // tb.pwf
    public List<RuleDefine> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc29718a", new Object[]{this});
        }
        this.f26356a = cl7.h(this.b);
        return super.a();
    }

    @Override // tb.pwf
    public RuleDefine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleDefine) ipChange.ipc$dispatch("449c899e", new Object[]{this});
        }
        this.f26356a = cl7.h(this.b);
        return super.b();
    }
}
