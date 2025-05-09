package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import javax.inject.Inject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yke extends qfj<ydc> implements a88 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a88 d = go6.c();
    @Inject
    public fyp e;

    static {
        t2o.a(511705375);
        t2o.a(511705336);
    }

    public yke() {
        b(this);
    }

    public static /* synthetic */ Object ipc$super(yke ykeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/ImageEditorHolder");
    }

    @Override // tb.a88
    public void a(qv1 qv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788f01db", new Object[]{this, qv1Var});
        } else {
            this.d.a(qv1Var);
        }
    }

    @Override // tb.a88
    public void b(yke ykeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23076de", new Object[]{this, ykeVar});
        } else {
            this.d.b(ykeVar);
        }
    }

    public ydc n(uqc uqcVar, Image image, ImageEditInfo imageEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ydc) ipChange.ipc$dispatch("7b8ec9b4", new Object[]{this, uqcVar, image, imageEditInfo});
        }
        return new ale(uqcVar, this, image, imageEditInfo);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.e.e();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.e.d();
        }
    }
}
