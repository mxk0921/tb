package tb;

import com.alilive.adapter.uikit.TLiveRoundedCornersProcessor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k3s implements xvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PhenixCreator f22387a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uvd f22388a;

        public a(uvd uvdVar) {
            this.f22388a = uvdVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            uvd uvdVar = this.f22388a;
            if (uvdVar != null) {
                uvdVar.onError(Integer.valueOf(failPhenixEvent.getResultCode()));
            }
            k3s.c(k3s.this).failListener(null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uvd f22389a;

        public b(uvd uvdVar) {
            this.f22389a = uvdVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(this.f22389a == null || succPhenixEvent.getDrawable() == null)) {
                this.f22389a.onSuccess(succPhenixEvent.getDrawable());
            }
            k3s.c(k3s.this).succListener(null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType;

        static {
            int[] iArr = new int[TLiveRoundedCornersProcessor.CornerType.values().length];
            $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType = iArr;
            try {
                iArr[TLiveRoundedCornersProcessor.CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType[TLiveRoundedCornersProcessor.CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType[TLiveRoundedCornersProcessor.CornerType.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType[TLiveRoundedCornersProcessor.CornerType.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType[TLiveRoundedCornersProcessor.CornerType.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(779092312);
        t2o.a(806355910);
    }

    public k3s(String str, PhenixCreator phenixCreator) {
        this.f22387a = phenixCreator;
    }

    public static /* synthetic */ PhenixCreator c(k3s k3sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("90a6afd8", new Object[]{k3sVar});
        }
        return k3sVar.f22387a;
    }

    @Override // tb.xvd
    public xvd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("e6208413", new Object[]{this});
        }
        PhenixCreator phenixCreator = this.f22387a;
        if (phenixCreator != null) {
            phenixCreator.fetch();
        }
        return this;
    }

    @Override // tb.xvd
    public xvd b(uvd uvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("45039948", new Object[]{this, uvdVar});
        }
        PhenixCreator phenixCreator = this.f22387a;
        if (phenixCreator != null) {
            phenixCreator.succListener(new b(uvdVar)).failListener(new a(uvdVar));
        }
        return this;
    }

    public xvd d(vvd... vvdVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("fe7a837f", new Object[]{this, vvdVarArr});
        }
        if (this.f22387a != null) {
            int length = vvdVarArr.length;
            ad2[] ad2VarArr = new ad2[length];
            for (int i = 0; i < length; i++) {
                vvd vvdVar = vvdVarArr[i];
                if (vvdVar instanceof z2s) {
                    z2s z2sVar = (z2s) vvdVar;
                    ad2VarArr[i] = new yf2(z2sVar.a(), z2sVar.b(), z2sVar.c());
                } else if (vvdVar instanceof g3s) {
                    g3s g3sVar = (g3s) vvdVar;
                    ad2VarArr[i] = new iy4(g3sVar.b(), g3sVar.a());
                } else if (vvdVar instanceof TLiveRoundedCornersProcessor) {
                    TLiveRoundedCornersProcessor tLiveRoundedCornersProcessor = (TLiveRoundedCornersProcessor) vvdVar;
                    RoundedCornersBitmapProcessor.CornerType cornerType = RoundedCornersBitmapProcessor.CornerType.ALL;
                    int i2 = c.$SwitchMap$com$alilive$adapter$uikit$TLiveRoundedCornersProcessor$CornerType[tLiveRoundedCornersProcessor.a().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            cornerType = RoundedCornersBitmapProcessor.CornerType.TOP;
                        } else if (i2 == 3) {
                            cornerType = RoundedCornersBitmapProcessor.CornerType.LEFT;
                        } else if (i2 == 4) {
                            cornerType = RoundedCornersBitmapProcessor.CornerType.RIGHT;
                        } else if (i2 == 5) {
                            cornerType = RoundedCornersBitmapProcessor.CornerType.BOTTOM;
                        }
                    }
                    ad2VarArr[i] = new RoundedCornersBitmapProcessor(tLiveRoundedCornersProcessor.e(), tLiveRoundedCornersProcessor.d(), tLiveRoundedCornersProcessor.c(), tLiveRoundedCornersProcessor.b(), cornerType);
                } else if (vvdVar instanceof n3s) {
                    ad2VarArr[i] = new wog((n3s) vvdVar);
                }
            }
            this.f22387a.bitmapProcessors(ad2VarArr);
        }
        return this;
    }

    public k3s() {
    }
}
