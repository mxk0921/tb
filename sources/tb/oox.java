package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.xsl.refact.PullRefreshContainer;
import com.taobao.uikit.extend.component.refresh.TBAnimationHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class oox extends phw<Void, FrameLayout, acx<a<asi, MetaResult<asi>>>> implements auc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f25536a;
    public FrameLayout b;
    public TBAnimationHeader c;
    public c5n d;
    public boolean e;
    public boolean f;

    static {
        t2o.a(993002090);
        t2o.a(993001866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oox(String[] strArr, Activity activity, ude udeVar, acx<a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.f25536a = strArr;
    }

    public static /* synthetic */ Object ipc$super(oox ooxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslRefreshWidget");
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        }
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: q2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        PullRefreshContainer pullRefreshContainer = new PullRefreshContainer(getActivity());
        this.b = pullRefreshContainer;
        pullRefreshContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, p1p.a(300.0f)));
        TBAnimationHeader tBAnimationHeader = new TBAnimationHeader(getActivity());
        this.c = tBAnimationHeader;
        String[] strArr = this.f25536a;
        if (strArr != null) {
            tBAnimationHeader.setRefreshTips(strArr);
        }
        TBAnimationHeader tBAnimationHeader2 = this.c;
        if (tBAnimationHeader2 != null) {
            FrameLayout frameLayout = this.b;
            if (frameLayout != null) {
                c5n c5nVar = new c5n(this, tBAnimationHeader2, (PullRefreshContainer) frameLayout, false, new zwm(999, 3001, 1000));
                this.d = c5nVar;
                c5nVar.v(this.f);
                if (this.f) {
                    FrameLayout frameLayout2 = this.b;
                    if (frameLayout2 != null) {
                        TBAnimationHeader tBAnimationHeader3 = this.c;
                        if (tBAnimationHeader3 != null) {
                            frameLayout2.addView(tBAnimationHeader3, new ViewGroup.LayoutParams(-1, -2));
                        } else {
                            ckf.y("refreshHeader");
                            throw null;
                        }
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                }
                FrameLayout frameLayout3 = this.b;
                if (frameLayout3 != null) {
                    return frameLayout3;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("refreshHeader");
        throw null;
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d992e5e8", new Object[]{this});
            return;
        }
        vee W = getModel().c().W();
        if (W != null) {
            W.onReachTopTrigger(this);
        }
    }

    public final void t2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        TBAnimationHeader tBAnimationHeader = this.c;
        if (tBAnimationHeader != null) {
            tBAnimationHeader.setBackgroundColor(i);
        } else {
            ckf.y("refreshHeader");
            throw null;
        }
    }

    public final void u2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else if (this.f != z) {
            this.f = z;
            c5n c5nVar = this.d;
            if (c5nVar != null) {
                c5nVar.v(z);
            }
            c5n c5nVar2 = this.d;
            if (c5nVar2 != null) {
                c5nVar2.u();
            }
            if (getView() != 0) {
                if (z) {
                    FrameLayout frameLayout = this.b;
                    if (frameLayout != null) {
                        TBAnimationHeader tBAnimationHeader = this.c;
                        if (tBAnimationHeader != null) {
                            frameLayout.addView(tBAnimationHeader, new ViewGroup.LayoutParams(-1, -2));
                        } else {
                            ckf.y("refreshHeader");
                            throw null;
                        }
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                } else {
                    FrameLayout frameLayout2 = this.b;
                    if (frameLayout2 != null) {
                        frameLayout2.removeAllViews();
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                }
            }
        }
    }

    @Override // tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
        } else if (this.e) {
        } else {
            if (((int) f) < 1) {
                TBAnimationHeader tBAnimationHeader = this.c;
                if (tBAnimationHeader != null) {
                    tBAnimationHeader.changeToState(TBRefreshHeader.RefreshState.PULL_TO_REFRESH);
                    TBAnimationHeader tBAnimationHeader2 = this.c;
                    if (tBAnimationHeader2 != null) {
                        tBAnimationHeader2.setProgress(f);
                    } else {
                        ckf.y("refreshHeader");
                        throw null;
                    }
                } else {
                    ckf.y("refreshHeader");
                    throw null;
                }
            } else {
                TBAnimationHeader tBAnimationHeader3 = this.c;
                if (tBAnimationHeader3 != null) {
                    tBAnimationHeader3.setProgress(f);
                    TBAnimationHeader tBAnimationHeader4 = this.c;
                    if (tBAnimationHeader4 != null) {
                        tBAnimationHeader4.changeToState(TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                    } else {
                        ckf.y("refreshHeader");
                        throw null;
                    }
                } else {
                    ckf.y("refreshHeader");
                    throw null;
                }
            }
        }
    }

    public final void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a69b25", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            TBAnimationHeader tBAnimationHeader = this.c;
            if (tBAnimationHeader != null) {
                tBAnimationHeader.changeToState(TBRefreshHeader.RefreshState.REFRESHING);
                vee W = getModel().c().W();
                if (W != null) {
                    W.onPullRefreshTrigger(getModel().e().getIndex());
                    return;
                }
                return;
            }
            ckf.y("refreshHeader");
            throw null;
        }
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd92ceb2", new Object[]{this});
            return;
        }
        this.e = false;
        TBAnimationHeader tBAnimationHeader = this.c;
        if (tBAnimationHeader != null) {
            tBAnimationHeader.changeToState(TBRefreshHeader.RefreshState.NONE);
            c5n c5nVar = this.d;
            if (c5nVar != null) {
                c5nVar.r();
            }
            c5n c5nVar2 = this.d;
            if (c5nVar2 != null && c5nVar2.t()) {
                TBAnimationHeader tBAnimationHeader2 = this.c;
                if (tBAnimationHeader2 != null) {
                    tBAnimationHeader2.changeToState(TBRefreshHeader.RefreshState.PULL_TO_REFRESH);
                } else {
                    ckf.y("refreshHeader");
                    throw null;
                }
            }
        } else {
            ckf.y("refreshHeader");
            throw null;
        }
    }
}
