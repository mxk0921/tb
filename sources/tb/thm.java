package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class thm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IPopData f28720a;
    public final int b;
    public final View c;
    public esu d;

    public thm(IPopData iPopData) {
        this.b = -1;
        this.f28720a = iPopData;
    }

    public IPopData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("5b306b5c", new Object[]{this});
        }
        return this.f28720a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3e99cec", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b9599910", new Object[]{this});
        }
        return this.c;
    }

    public esu d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esu) ipChange.ipc$dispatch("6182b65b", new Object[]{this});
        }
        return this.d;
    }

    public void e(esu esuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5161561", new Object[]{this, esuVar});
        } else {
            this.d = esuVar;
        }
    }

    public thm(IPopData iPopData, int i, View view) {
        this.f28720a = iPopData;
        this.b = i;
        this.c = view;
    }
}
