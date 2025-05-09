package com.taobao.taolive.lpm_android;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taolive.lpm_android.event.EventType;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LpmProxy extends k2n<ILpmProxy> implements ILpmProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LpmProxy";
    private static volatile LpmProxy sInstance;
    private ILpmProxy mRemoteProxy;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13010a;
        public final /* synthetic */ IMediaPlayer b;

        public a(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13010a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onPrepareStart(this.f13010a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13011a;
        public final /* synthetic */ NetRequest b;
        public final /* synthetic */ NetResponse c;

        public a0(LpmProxy lpmProxy, String str, NetRequest netRequest, NetResponse netResponse) {
            this.f13011a = str;
            this.b = netRequest;
            this.c = netResponse;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onSyncRequest(this.f13011a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13012a;
        public final /* synthetic */ IMediaPlayer b;

        public b(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13012a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onPlayStart(this.f13012a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13013a;
        public final /* synthetic */ MtopBusiness b;
        public final /* synthetic */ MtopResponse c;

        public b0(LpmProxy lpmProxy, String str, MtopBusiness mtopBusiness, MtopResponse mtopResponse) {
            this.f13013a = str;
            this.b = mtopBusiness;
            this.c = mtopResponse;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onSyncRequest(this.f13013a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13014a;
        public final /* synthetic */ IMediaPlayer b;

        public c(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13014a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onPauseStart(this.f13014a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13015a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public c0(LpmProxy lpmProxy, String str, String str2, String str3, Map map) {
            this.f13015a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.track4Click(this.f13015a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13016a;
        public final /* synthetic */ IMediaPlayer b;

        public d(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13016a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onSeekStart(this.f13016a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13017a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public d0(LpmProxy lpmProxy, String str, String str2, String str3, Map map) {
            this.f13017a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.track4Show(this.f13017a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13018a;
        public final /* synthetic */ IMediaPlayer b;

        public e(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13018a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onPrepareSuccess(this.f13018a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13019a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Map g;

        public e0(LpmProxy lpmProxy, String str, String str2, Integer num, String str3, String str4, String str5, Map map) {
            this.f13019a = str;
            this.b = str2;
            this.c = num;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.trackCustom(this.f13019a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13020a;
        public final /* synthetic */ IMediaPlayer b;

        public f(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13020a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onStartSuccess(this.f13020a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13021a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public f0(LpmProxy lpmProxy, String str, String str2, String str3, Map map) {
            this.f13021a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.trackCustom(this.f13021a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13022a;
        public final /* synthetic */ IMediaPlayer b;

        public g(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13022a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onPauseSuccess(this.f13022a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g0(LpmProxy lpmProxy) {
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.refreshConfig();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13023a;
        public final /* synthetic */ IMediaPlayer b;

        public h(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13023a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onSeekComplete(this.f13023a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13024a;
        public final /* synthetic */ Object b;

        public h0(LpmProxy lpmProxy, String str, Object obj) {
            this.f13024a = str;
            this.b = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.pageDisAppear(this.f13024a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13025a;
        public final /* synthetic */ IMediaPlayer b;

        public i(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer) {
            this.f13025a = str;
            this.b = iMediaPlayer;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onCompletion(this.f13025a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13026a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ String c;

        public i0(LpmProxy lpmProxy, String str, Object obj, String str2) {
            this.f13026a = str;
            this.b = obj;
            this.c = str2;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.updatePageName(this.f13026a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13027a;
        public final /* synthetic */ IMediaPlayer b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public j(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer, int i, int i2) {
            this.f13027a = str;
            this.b = iMediaPlayer;
            this.c = i;
            this.d = i2;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onError(this.f13027a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13028a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Map c;

        public j0(LpmProxy lpmProxy, String str, Object obj, Map map) {
            this.f13028a = str;
            this.b = obj;
            this.c = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.updatePageProperties(this.f13028a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13029a;

        public k(LpmProxy lpmProxy, Context context) {
            this.f13029a = context;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.initialize(this.f13029a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13030a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public k0(LpmProxy lpmProxy, String str, String str2, Map map) {
            this.f13030a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.trackPage(this.f13030a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13031a;
        public final /* synthetic */ IMediaPlayer b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Object f;

        public l(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            this.f13031a = str;
            this.b = iMediaPlayer;
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onInfo(this.f13031a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EventType f13032a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public l0(LpmProxy lpmProxy, EventType eventType, String str, JSONObject jSONObject, String str2, String str3) {
            this.f13032a = eventType;
            this.b = str;
            this.c = jSONObject;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.addTrace(this.f13032a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13033a;
        public final /* synthetic */ IMediaPlayer b;
        public final /* synthetic */ int c;

        public m(LpmProxy lpmProxy, String str, IMediaPlayer iMediaPlayer, int i) {
            this.f13033a = str;
            this.b = iMediaPlayer;
            this.c = i;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAudioFocusChange(this.f13033a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m0(LpmProxy lpmProxy) {
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.destroy();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13034a;
        public final /* synthetic */ TLiveMsg b;

        public n(LpmProxy lpmProxy, String str, TLiveMsg tLiveMsg) {
            this.f13034a = str;
            this.b = tLiveMsg;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onDispatch(this.f13034a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13035a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public n0(LpmProxy lpmProxy, String str, String str2, Object obj) {
            this.f13035a = str;
            this.b = str2;
            this.c = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.updateContext(this.f13035a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13036a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public o(LpmProxy lpmProxy, String str, int i, Object obj) {
            this.f13036a = str;
            this.b = i;
            this.c = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onMessageError(this.f13036a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13037a;

        public o0(LpmProxy lpmProxy, String str) {
            this.f13037a = str;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.clearContext(this.f13037a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13038a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public p(LpmProxy lpmProxy, String str, int i, int i2, String str2, String str3) {
            this.f13038a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onSubscribe(this.f13038a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13039a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public p0(LpmProxy lpmProxy, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f13039a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onActivate(this.f13039a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class q implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13040a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public q(LpmProxy lpmProxy, String str, int i, int i2, String str2, String str3) {
            this.f13040a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onUnSubscribe(this.f13040a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class q0 implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13041a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public q0(LpmProxy lpmProxy, String str, String str2, String str3, String str4, String str5) {
            this.f13041a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onRead(this.f13041a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class r implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13042a;
        public final /* synthetic */ NetRequest b;

        public r(LpmProxy lpmProxy, String str, NetRequest netRequest) {
            this.f13042a = str;
            this.b = netRequest;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncRequest(this.f13042a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface r0 {
        void a(ILpmProxy iLpmProxy);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class s implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13043a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NetRequest c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ NetBaseOutDo e;
        public final /* synthetic */ Object f;

        public s(LpmProxy lpmProxy, String str, int i, NetRequest netRequest, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            this.f13043a = str;
            this.b = i;
            this.c = netRequest;
            this.d = netResponse;
            this.e = netBaseOutDo;
            this.f = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncRequestSuccess(this.f13043a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class t implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13044a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NetRequest c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ Object e;

        public t(LpmProxy lpmProxy, String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
            this.f13044a = str;
            this.b = i;
            this.c = netRequest;
            this.d = netResponse;
            this.e = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncRequestError(this.f13044a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class u implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13045a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NetRequest c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ Object e;

        public u(LpmProxy lpmProxy, String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
            this.f13045a = str;
            this.b = i;
            this.c = netRequest;
            this.d = netResponse;
            this.e = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncRequestSystemError(this.f13045a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class v implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13046a;
        public final /* synthetic */ String b;

        public v(LpmProxy lpmProxy, String str, String str2) {
            this.f13046a = str;
            this.b = str2;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.updateAppInfo(this.f13046a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class w implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13047a;
        public final /* synthetic */ INetDataObject b;

        public w(LpmProxy lpmProxy, String str, INetDataObject iNetDataObject) {
            this.f13047a = str;
            this.b = iNetDataObject;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncINetDataRequest(this.f13047a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class x implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13048a;
        public final /* synthetic */ int b;
        public final /* synthetic */ INetDataObject c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ NetBaseOutDo e;
        public final /* synthetic */ Object f;

        public x(LpmProxy lpmProxy, String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            this.f13048a = str;
            this.b = i;
            this.c = iNetDataObject;
            this.d = netResponse;
            this.e = netBaseOutDo;
            this.f = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncINetDataRequestSuccess(this.f13048a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class y implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13049a;
        public final /* synthetic */ int b;
        public final /* synthetic */ INetDataObject c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ Object e;

        public y(LpmProxy lpmProxy, String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, Object obj) {
            this.f13049a = str;
            this.b = i;
            this.c = iNetDataObject;
            this.d = netResponse;
            this.e = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncINetDataRequestError(this.f13049a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class z implements r0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13050a;
        public final /* synthetic */ int b;
        public final /* synthetic */ INetDataObject c;
        public final /* synthetic */ NetResponse d;
        public final /* synthetic */ Object e;

        public z(LpmProxy lpmProxy, String str, int i, INetDataObject iNetDataObject, NetResponse netResponse, Object obj) {
            this.f13050a = str;
            this.b = i;
            this.c = iNetDataObject;
            this.d = netResponse;
            this.e = obj;
        }

        @Override // com.taobao.taolive.lpm_android.LpmProxy.r0
        public void a(ILpmProxy iLpmProxy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436a2a07", new Object[]{this, iLpmProxy});
            } else {
                iLpmProxy.onAsyncINetDataRequestSystemError(this.f13050a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(806355567);
        t2o.a(806355564);
    }

    private LpmProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[LpmProxy<init>] error: " + th.getMessage());
        }
    }

    private void executeIfRealAvailable(r0 r0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c405e19", new Object[]{this, r0Var});
            return;
        }
        ILpmProxy real = getReal();
        if (real != null) {
            try {
                r0Var.a(real);
            } catch (Throwable th) {
                FlexaLiveX.w("[ILpmProxy<executeIfRealAvailable>] error: " + th.getMessage());
            }
        }
    }

    public static LpmProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LpmProxy) ipChange.ipc$dispatch("aba84534", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (LpmProxy.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LpmProxy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static /* synthetic */ Object ipc$super(LpmProxy lpmProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/lpm_android/LpmProxy");
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void addTrace(EventType eventType, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822d4103", new Object[]{this, eventType, str, jSONObject, str2, str3});
        } else {
            executeIfRealAvailable(new l0(this, eventType, str, jSONObject, str2, str3));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void clearContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d658bb3", new Object[]{this, str});
        } else {
            executeIfRealAvailable(new o0(this, str));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            executeIfRealAvailable(new m0(this));
        }
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ILpmProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.taolive.lpm_android.LpmProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "Lpm";
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else {
            executeIfRealAvailable(new k(this, context));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onActivate(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ba0b35", new Object[]{this, str, str2, str3, str4, str5, str6});
        } else {
            executeIfRealAvailable(new p0(this, str, str2, str3, str4, str5, str6));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncINetDataRequest(String str, INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a7d295", new Object[]{this, str, iNetDataObject});
        } else {
            executeIfRealAvailable(new w(this, str, iNetDataObject));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncINetDataRequestError(String str, int i2, INetDataObject iNetDataObject, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53533d3", new Object[]{this, str, new Integer(i2), iNetDataObject, netResponse, obj});
        } else {
            executeIfRealAvailable(new y(this, str, i2, iNetDataObject, netResponse, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncINetDataRequestSuccess(String str, int i2, INetDataObject iNetDataObject, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d6ce56", new Object[]{this, str, new Integer(i2), iNetDataObject, netResponse, netBaseOutDo, obj});
        } else {
            executeIfRealAvailable(new x(this, str, i2, iNetDataObject, netResponse, netBaseOutDo, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncINetDataRequestSystemError(String str, int i2, INetDataObject iNetDataObject, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c593b64", new Object[]{this, str, new Integer(i2), iNetDataObject, netResponse, obj});
        } else {
            executeIfRealAvailable(new z(this, str, i2, iNetDataObject, netResponse, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncRequest(String str, NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711feb02", new Object[]{this, str, netRequest});
        } else {
            executeIfRealAvailable(new r(this, str, netRequest));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncRequestError(String str, int i2, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30a1880", new Object[]{this, str, new Integer(i2), netRequest, netResponse, obj});
        } else {
            executeIfRealAvailable(new t(this, str, i2, netRequest, netResponse, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncRequestSuccess(String str, int i2, NetRequest netRequest, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cb86c9", new Object[]{this, str, new Integer(i2), netRequest, netResponse, netBaseOutDo, obj});
        } else {
            executeIfRealAvailable(new s(this, str, i2, netRequest, netResponse, netBaseOutDo, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAsyncRequestSystemError(String str, int i2, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c7cf11", new Object[]{this, str, new Integer(i2), netRequest, netResponse, obj});
        } else {
            executeIfRealAvailable(new u(this, str, i2, netRequest, netResponse, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onAudioFocusChange(String str, IMediaPlayer iMediaPlayer, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b00654b", new Object[]{this, str, iMediaPlayer, new Integer(i2)});
        } else {
            executeIfRealAvailable(new m(this, str, iMediaPlayer, i2));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public NetRequest onBuildRequest(String str, INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("675873fe", new Object[]{this, str, iNetDataObject});
        }
        if (getReal() != null) {
            return getReal().onBuildRequest(str, iNetDataObject);
        }
        return null;
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onCompletion(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22801e2", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new i(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onDispatch(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6721093f", new Object[]{this, str, tLiveMsg});
        } else {
            executeIfRealAvailable(new n(this, str, tLiveMsg));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onError(String str, IMediaPlayer iMediaPlayer, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3027390", new Object[]{this, str, iMediaPlayer, new Integer(i2), new Integer(i3)});
        } else {
            executeIfRealAvailable(new j(this, str, iMediaPlayer, i2, i3));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onInfo(String str, IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefbc0ac", new Object[]{this, str, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj});
        } else {
            executeIfRealAvailable(new l(this, str, iMediaPlayer, j2, j3, j4, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onMessageError(String str, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3342582e", new Object[]{this, str, new Integer(i2), obj});
        } else {
            executeIfRealAvailable(new o(this, str, i2, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onPauseStart(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f1fe12", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new c(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onPauseSuccess(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180842f3", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new g(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onPlayStart(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6bb36", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new b(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onPrepareStart(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e38e61", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new a(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onPrepareSuccess(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6fb82", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new e(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onRead(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d329b0e", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            executeIfRealAvailable(new q0(this, str, str2, str3, str4, str5));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onSeekComplete(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb136b97", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new h(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onSeekStart(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01b0472", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new d(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onStartSuccess(String str, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245e0907", new Object[]{this, str, iMediaPlayer});
        } else {
            executeIfRealAvailable(new f(this, str, iMediaPlayer));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onSubscribe(String str, int i2, int i3, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c5baf0", new Object[]{this, str, new Integer(i2), new Integer(i3), str2, str3});
        } else {
            executeIfRealAvailable(new p(this, str, i2, i3, str2, str3));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onSyncRequest(String str, NetRequest netRequest, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbb9e1a", new Object[]{this, str, netRequest, netResponse});
        } else {
            executeIfRealAvailable(new a0(this, str, netRequest, netResponse));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onUnSubscribe(String str, int i2, int i3, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61986797", new Object[]{this, str, new Integer(i2), new Integer(i3), str2, str3});
        } else {
            executeIfRealAvailable(new q(this, str, i2, i3, str2, str3));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void pageDisAppear(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd14e21", new Object[]{this, str, obj});
        } else {
            executeIfRealAvailable(new h0(this, str, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void refreshConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187004", new Object[]{this});
        } else {
            executeIfRealAvailable(new g0(this));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void track4Click(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680de1", new Object[]{this, str, str2, str3, map});
        } else {
            executeIfRealAvailable(new c0(this, str, str2, str3, map));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void track4Show(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcc299a", new Object[]{this, str, str2, str3, map});
        } else {
            executeIfRealAvailable(new d0(this, str, str2, str3, map));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void trackCustom(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541e3f87", new Object[]{this, str, str2, num, str3, str4, str5, map});
        } else {
            executeIfRealAvailable(new e0(this, str, str2, num, str3, str4, str5, map));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void trackPage(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabed450", new Object[]{this, str, str2, map});
        } else {
            executeIfRealAvailable(new k0(this, str, str2, map));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void updateAppInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57fd5981", new Object[]{this, str, str2});
        } else {
            executeIfRealAvailable(new v(this, str, str2));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void updateContext(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9502965d", new Object[]{this, str, str2, obj});
        } else {
            executeIfRealAvailable(new n0(this, str, str2, obj));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void updatePageName(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8446b49a", new Object[]{this, str, obj, str2});
        } else {
            executeIfRealAvailable(new i0(this, str, obj, str2));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void updatePageProperties(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24bc50d", new Object[]{this, str, obj, map});
        } else {
            executeIfRealAvailable(new j0(this, str, obj, map));
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ILpmProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ILpmProxy) ipChange.ipc$dispatch("846bd3c3", new Object[]{this})) : new LpmProxyX();
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void onSyncRequest(String str, MtopBusiness mtopBusiness, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3d0789", new Object[]{this, str, mtopBusiness, mtopResponse});
        } else {
            executeIfRealAvailable(new b0(this, str, mtopBusiness, mtopResponse));
        }
    }

    @Override // com.taobao.taolive.lpm_android.ILpmProxy
    public void trackCustom(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbf9ca4", new Object[]{this, str, str2, str3, map});
        } else {
            executeIfRealAvailable(new f0(this, str, str2, str3, map));
        }
    }
}
