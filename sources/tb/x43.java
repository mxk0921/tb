package tb;

import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class x43 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ w43 c;
    public final /* synthetic */ int d;

    public x43(w43 w43Var, int i) {
        this.c = w43Var;
        this.d = i;
    }

    public static /* synthetic */ Object ipc$super(x43 x43Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV1$switchShowType$1");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        int N = w43.N(this.c);
        int i = this.d;
        if (N != i) {
            w43.T(this.c, i);
            int N2 = w43.N(this.c);
            if (N2 == 1) {
                w43 w43Var = this.c;
                TextView R = w43.R(w43Var);
                if (R != null) {
                    w43.W(w43Var, R, false);
                    w43 w43Var2 = this.c;
                    TextView Q = w43.Q(w43Var2);
                    if (Q != null) {
                        w43.W(w43Var2, Q, false);
                        w43 w43Var3 = this.c;
                        TextView S = w43.S(w43Var3);
                        if (S != null) {
                            w43.W(w43Var3, S, true);
                        } else {
                            ckf.y("tabHistoryTv");
                            throw null;
                        }
                    } else {
                        ckf.y("tabAlbum");
                        throw null;
                    }
                } else {
                    ckf.y("tabBrowsed");
                    throw null;
                }
            } else if (N2 != 2) {
                w43 w43Var4 = this.c;
                TextView S2 = w43.S(w43Var4);
                if (S2 != null) {
                    w43.W(w43Var4, S2, false);
                    w43 w43Var5 = this.c;
                    TextView R2 = w43.R(w43Var5);
                    if (R2 != null) {
                        w43.W(w43Var5, R2, false);
                        w43 w43Var6 = this.c;
                        TextView Q2 = w43.Q(w43Var6);
                        if (Q2 != null) {
                            w43.W(w43Var6, Q2, true);
                        } else {
                            ckf.y("tabAlbum");
                            throw null;
                        }
                    } else {
                        ckf.y("tabBrowsed");
                        throw null;
                    }
                } else {
                    ckf.y("tabHistoryTv");
                    throw null;
                }
            } else {
                w43 w43Var7 = this.c;
                TextView Q3 = w43.Q(w43Var7);
                if (Q3 != null) {
                    w43.W(w43Var7, Q3, false);
                    w43 w43Var8 = this.c;
                    TextView S3 = w43.S(w43Var8);
                    if (S3 != null) {
                        w43.W(w43Var8, S3, false);
                        w43 w43Var9 = this.c;
                        TextView R3 = w43.R(w43Var9);
                        if (R3 != null) {
                            w43.W(w43Var9, R3, true);
                        } else {
                            ckf.y("tabBrowsed");
                            throw null;
                        }
                    } else {
                        ckf.y("tabHistoryTv");
                        throw null;
                    }
                } else {
                    ckf.y("tabAlbum");
                    throw null;
                }
            }
            w43.O(this.c).onTabChanged(w43.N(this.c));
        }
    }
}
