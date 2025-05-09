package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ww1 extends hsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Boolean b;
    public boolean c = true;
    public boolean d;

    static {
        t2o.a(815792891);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww1(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
    }

    public static /* synthetic */ Object ipc$super(ww1 ww1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/list/BaseListPlugin");
    }

    @Override // tb.hsi
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    @Override // tb.hsi
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    @Override // tb.hsi
    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e376a5c", new Object[]{this});
            return;
        }
        n(this.c);
        this.c = false;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54645ac", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89582ae9", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) a().getModel()).e().getTotalSearchResult();
            if (baseSearchResult != null) {
                Boolean valueOf = Boolean.valueOf(((CommonSearchResult) baseSearchResult).newSearch);
                this.b = valueOf;
                return valueOf.booleanValue();
            }
            this.b = Boolean.FALSE;
        }
        Boolean bool = this.b;
        ckf.d(bool);
        return bool.booleanValue();
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b693f8", new Object[]{this, new Boolean(z)});
        }
    }
}
