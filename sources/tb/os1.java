package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class os1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f25609a;
    public final Context b;
    public final ux9 c;
    public TBLiveDataModel d;
    public final msn e = new msn();
    public fzf f;
    public TaoLiveKtCommentEntity g;
    public final int h;
    public hp3 i;

    static {
        t2o.a(295698640);
        t2o.a(295698643);
    }

    public os1(Context context, View view, ux9 ux9Var) {
        this.b = context;
        this.f25609a = view;
        this.c = ux9Var;
        this.h = hw0.b(context, p44.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da8805", new Object[]{this});
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d2c76a", new Object[]{this, new Integer(i)});
        }
    }

    public void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970601d1", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        fzf fzfVar = new fzf();
        this.f = fzfVar;
        fzfVar.f19644a = taoLiveKtCommentEntity;
        this.g = taoLiveKtCommentEntity;
    }

    public void d(hp3 hp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0059bb", new Object[]{this, hp3Var});
        } else {
            this.i = hp3Var;
        }
    }

    public void e(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a82b46", new Object[]{this, tBLiveDataModel});
        } else {
            this.d = tBLiveDataModel;
        }
    }
}
