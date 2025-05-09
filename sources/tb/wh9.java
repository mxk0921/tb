package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Filter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wh9 extends hu1<Filter> implements y6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705465);
        t2o.a(511705358);
    }

    public static /* synthetic */ Object ipc$super(wh9 wh9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/FilterEditorImpl");
    }

    @Override // tb.y6c
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7571aa2c", new Object[]{this});
            return;
        }
        t();
        g().b(null);
    }

    @Override // tb.y6c
    public Filter getFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Filter) ipChange.ipc$dispatch("e77accf2", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.y6c
    public void l(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9d2bec", new Object[]{this, filter});
            return;
        }
        t();
        g().b(filter.clone());
    }
}
