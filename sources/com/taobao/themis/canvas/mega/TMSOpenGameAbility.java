package com.taobao.themis.canvas.mega;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOpenGameAbility;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.t2o;
import tb.t8c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/canvas/mega/TMSOpenGameAbility;", "Lcom/taobao/android/abilityidl/ability/AbsOpenGameAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/jdb;", "callback", "Ltb/xhv;", "onFirstFrame", "(Ltb/kdb;Ltb/jdb;)V", "themis_canvas_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSOpenGameAbility extends AbsOpenGameAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(834666585);
    }

    public static /* synthetic */ Object ipc$super(TMSOpenGameAbility tMSOpenGameAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/mega/TMSOpenGameAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenGameAbility
    public void onFirstFrame(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263db4e", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        t8c t8cVar = (t8c) g.getExtension(t8c.class);
        if (t8cVar != null) {
            t8cVar.hideLoading();
        }
    }
}
