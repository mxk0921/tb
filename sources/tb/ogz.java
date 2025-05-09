package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.components.text.NCComponentText;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ogz extends NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736965);
    }

    public static /* synthetic */ Object ipc$super(ogz ogzVar, String str, Object... objArr) {
        if (str.hashCode() == -76004444) {
            super.onUpdateViewWithContext((biz) objArr[0], (jkz) objArr[1], (jkz) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text/NCComponentTextViewHandler");
    }

    public final void b(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c30c8e9", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(str, "fontFamily");
        j7z j7zVar = j7z.INSTANCE;
        Context context = getView().getContext();
        ckf.f(context, "view.context");
        ((NCComponentText) getView()).setTypeface(j7zVar.a(context, str, i, i2));
    }

    public final float c(float f, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeb99f9f", new Object[]{this, new Float(f), context})).floatValue();
        }
        ckf.g(context, "context");
        return e5z.INSTANCE.b(context, f);
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCComponentText(context);
    }

    @Override // com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler
    public void onUpdateViewWithContext(biz bizVar, jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7843a4", new Object[]{this, bizVar, jkzVar, jkzVar2});
            return;
        }
        ckf.g(bizVar, "nanoContext");
        if (jkzVar2 != null) {
            super.onUpdateViewWithContext(bizVar, jkzVar, jkzVar2);
            if (!jkzVar2.equals(jkzVar)) {
                NCComponentText nCComponentText = (NCComponentText) getView();
                trz trzVar = jkzVar instanceof trz ? (trz) jkzVar : null;
                trz trzVar2 = (trz) jkzVar2;
                if (trzVar == null || !ckf.b(trzVar2.J(), trzVar.J())) {
                    nCComponentText.setText(trzVar2.J());
                }
                if (trzVar == null || !ckf.b(trzVar2.B(), trzVar.B())) {
                    nCComponentText.setTextColor(Color.parseColor(trzVar2.B()));
                }
                if (trzVar == null || trzVar2.D() != trzVar.D()) {
                    float D = trzVar2.D();
                    Context context = nCComponentText.getContext();
                    ckf.f(context, "textView.context");
                    nCComponentText.setTextSize(0, c(D, context));
                }
                if (trzVar == null || !ckf.b(trzVar2.C(), trzVar.C()) || !i7z.b(trzVar2.E(), trzVar.E()) || !l7z.b(trzVar2.F(), trzVar.F())) {
                    b(trzVar2.C(), trzVar2.E(), trzVar2.F());
                }
                if ((trzVar == null || trzVar2.G() != trzVar.G()) && !Float.isNaN(trzVar2.G())) {
                    float G = trzVar2.G();
                    Context context2 = nCComponentText.getContext();
                    ckf.f(context2, "textView.context");
                    nCComponentText.setLetterSpacing(c(G, context2));
                }
                if ((trzVar == null || trzVar2.H() != trzVar.H()) && !Float.isNaN(trzVar2.H()) && trzVar2.H() > 0.0f) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        float H = trzVar2.H();
                        Context context3 = nCComponentText.getContext();
                        ckf.f(context3, "textView.context");
                        nCComponentText.setLineHeight(iai.d(c(H, context3)));
                    } else {
                        float H2 = trzVar2.H();
                        Context context4 = nCComponentText.getContext();
                        ckf.f(context4, "textView.context");
                        nCComponentText.setLineSpacing(c(H2, context4) - nCComponentText.getLineHeight(), 1.0f);
                    }
                }
                if (trzVar == null || !rrz.b(trzVar2.L(), trzVar.L())) {
                    int L = trzVar2.L();
                    if (rrz.b(L, rrz.a(0))) {
                        nCComponentText.setPaintFlags(nCComponentText.getPaintFlags() & (-25));
                    } else if (rrz.b(L, rrz.a(1))) {
                        nCComponentText.setPaintFlags(nCComponentText.getPaintFlags() | 8);
                        nCComponentText.setPaintFlags(nCComponentText.getPaintFlags() & (-17));
                    } else if (rrz.b(L, rrz.a(2))) {
                        nCComponentText.setPaintFlags(nCComponentText.getPaintFlags() | 16);
                        nCComponentText.setPaintFlags(nCComponentText.getPaintFlags() & (-9));
                    }
                }
                if (trzVar == null || !qrz.b(trzVar2.K(), trzVar.K())) {
                    int K = trzVar2.K();
                    if (qrz.b(K, qrz.a(0))) {
                        nCComponentText.setTextAlignment(5);
                        nCComponentText.setGravity(GravityCompat.START);
                    } else if (qrz.b(K, qrz.a(1))) {
                        nCComponentText.setTextAlignment(4);
                        nCComponentText.setGravity(17);
                    } else if (qrz.b(K, qrz.a(2))) {
                        nCComponentText.setTextAlignment(6);
                        nCComponentText.setGravity(GravityCompat.END);
                    }
                }
                if (trzVar == null || !srz.b(trzVar2.M(), trzVar.M())) {
                    int M = trzVar2.M();
                    if (srz.b(M, srz.a(0))) {
                        nCComponentText.setEllipsize(null);
                    } else if (srz.b(M, srz.a(1))) {
                        nCComponentText.setEllipsize(TextUtils.TruncateAt.END);
                    } else if (srz.b(M, srz.a(2))) {
                        nCComponentText.setEllipsize(null);
                    }
                }
                if (trzVar == null || trzVar2.I() != trzVar.I()) {
                    nCComponentText.setMaxLines(trzVar2.I());
                }
            }
        }
    }
}
