package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.definition.OpenArchBizCode;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import java.lang.ref.WeakReference;
import tb.azd;
import tb.bzd;
import tb.cf;
import tb.czd;
import tb.d4s;
import tb.d9m;
import tb.ezd;
import tb.fyk;
import tb.g2g;
import tb.gyk;
import tb.jbt;
import tb.k3h;
import tb.pvs;
import tb.qvs;
import tb.t2o;
import tb.x5t;
import tb.ze2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveOpenLiveRoom extends ATaoLiveOpenEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TaoliveOpenLiveRoom.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum;

        static {
            int[] iArr = new int[TaoliveLifeCycleEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum = iArr;
            try {
                iArr[TaoliveLifeCycleEnum.onCreate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onWillAppear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onDidAppear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onWillDisappear.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onDidDisappear.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onPause.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onStart.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onResume.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onStop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[TaoliveLifeCycleEnum.onDestory.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public bzd f13191a;
        public cf b;
        public czd c;
        public azd d;
        public String e;
        public jbt f;

        static {
            t2o.a(779093011);
        }

        public TaoliveOpenLiveRoom a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("8907181", new Object[]{this});
            }
            return new TaoliveOpenLiveRoom(this, null);
        }

        public b b(azd azdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("85001eb5", new Object[]{this, azdVar});
            }
            this.d = azdVar;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2354fb84", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b d(bzd bzdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("59959a89", new Object[]{this, bzdVar});
            }
            this.f13191a = bzdVar;
            return this;
        }

        public b e(cf cfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("33e7ba6d", new Object[]{this, cfVar});
            }
            this.b = cfVar;
            return this;
        }

        public b f(jbt jbtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c310eb7e", new Object[]{this, jbtVar});
            }
            this.f = jbtVar;
            return this;
        }

        public b g(czd czdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7e0b89bf", new Object[]{this, czdVar});
            }
            this.c = czdVar;
            return this;
        }
    }

    static {
        t2o.a(779093009);
    }

    public /* synthetic */ TaoliveOpenLiveRoom(b bVar, a aVar) {
        this(bVar);
    }

    public static b builder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1cbc16b7", new Object[0]);
        }
        return new b();
    }

    private void checkKMPArchEntityActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc91f8c", new Object[]{this});
        } else if (this.kmpIdentifier != null && d9m.P().fetchEntity(this.kmpIdentifier) == null) {
            x5t.d(TAG, "KMPOpenArch is released,  recreate kmp Open Arch Entity");
            createKMPArchEntity();
            this.eventCompontent.c().S(this.kmpIdentifier);
        }
    }

    private void createKMPArchEntity() {
        OpenArchBizCode openArchBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fd3532", new Object[]{this});
        } else if (pvs.k0()) {
            gyk gykVar = new gyk();
            if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.SingleLiveRoomShopTab3;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.SingleLiveRoomShopLoft;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.SingleLiveRoomCard;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.WatchLiveRoomChanelMix;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.WatchLiveRoomPublic;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.WatchLiveRoomHomeTab;
            } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(this.bizCode)) {
                openArchBizCode = OpenArchBizCode.WatchLiveRoomAppTab2;
            } else {
                return;
            }
            gykVar.k(openArchBizCode);
            if (qvs.a0()) {
                gykVar.b(new g2g(true));
            }
            String k = d9m.P().createEntity(new fyk(null, gykVar)).k();
            this.kmpIdentifier = k;
            cf cfVar = this.eventCompontent;
            if (cfVar != null) {
                cfVar.e(k);
            }
            x5t.d(TAG, "createKMPArchEntity");
        }
    }

    public static /* synthetic */ Object ipc$super(TaoliveOpenLiveRoom taoliveOpenLiveRoom, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/entity/TaoliveOpenLiveRoom");
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public void accessListener(AccessListenerEnum accessListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d134de5", new Object[]{this, accessListenerEnum, objArr});
        } else {
            invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent, this.taoliveOpenContext, this.eventCompontent, accessListenerEnum, objArr);
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public void callLifeCycle(TaoliveLifeCycleEnum taoliveLifeCycleEnum, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f21787", new Object[]{this, taoliveLifeCycleEnum, obj});
        } else if (taoliveLifeCycleEnum != null) {
            switch (a.$SwitchMap$com$taobao$taolive$room$openarchitecture$entity$TaoliveLifeCycleEnum[taoliveLifeCycleEnum.ordinal()]) {
                case 1:
                    checkKMPArchEntityActive();
                    this.params = obj;
                    callPlatform(PlatformListenerEnum.onCreate, ze2.c(this.bizCode, obj));
                    return;
                case 2:
                    callPlatform(PlatformListenerEnum.onWillAppear, obj);
                    return;
                case 3:
                    callPlatform(PlatformListenerEnum.onDidAppear, obj);
                    return;
                case 4:
                    callPlatform(PlatformListenerEnum.onWillDisappear, obj);
                    return;
                case 5:
                    callPlatform(PlatformListenerEnum.onDidDisappear, obj);
                    return;
                case 6:
                    callPlatform(PlatformListenerEnum.onPause, obj);
                    return;
                case 7:
                    if (d4s.e("enablePMIrregularTrack", true)) {
                        callPlatform(PlatformListenerEnum.onStart, obj);
                        return;
                    }
                    return;
                case 8:
                    callPlatform(PlatformListenerEnum.onResume, obj);
                    return;
                case 9:
                    callPlatform(PlatformListenerEnum.onStop, obj);
                    return;
                case 10:
                    callPlatform(PlatformListenerEnum.onDestory, obj);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object callPlatform(PlatformListenerEnum platformListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83054df7", new Object[]{this, platformListenerEnum, objArr});
        }
        return invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent, this.taoliveOpenContext, this.eventCompontent, platformListenerEnum, objArr);
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object callWatchPlatform(WatchPlatformListenerEnum watchPlatformListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("865b8fa9", new Object[]{this, watchPlatformListenerEnum, objArr});
        }
        return invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchCompontent, this.taoliveOpenContext, this.eventCompontent, watchPlatformListenerEnum, objArr);
    }

    @Override // com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity
    public Object invokeCommand(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        ezd ezdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0a66a31", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        WeakReference<ezd> weakReference = this.taoliveServicesWeakReference;
        if (weakReference == null || (ezdVar = weakReference.get()) == null) {
            return null;
        }
        return ezdVar.a(taoliveGatewayEnum, jbtVar, objArr);
    }

    private TaoliveOpenLiveRoom(b bVar) {
        k3h.a().b();
        this.dataCompontent = bVar.f13191a;
        this.eventCompontent = bVar.b;
        this.uiCompontent = bVar.c;
        this.abilityCompontent = bVar.d;
        this.bizCode = bVar.e;
        this.taoliveOpenContext = bVar.f;
        this.identifer = String.valueOf(hashCode());
        createKMPArchEntity();
    }
}
