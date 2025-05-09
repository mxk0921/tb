package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts.ReadContactsTask;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.activityresult.IActivityResultService;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.kon;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aca extends vx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FluidContext g;
    public final Context h;
    public final IInteractionService i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f15655a;

        public a(vrp vrpVar) {
            this.f15655a = vrpVar;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
            } else {
                aca.t(aca.this, this.f15655a, hVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f15656a;

        public b(vrp vrpVar) {
            this.f15656a = vrpVar;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
            } else if (this.f15656a.g != null) {
                HashMap hashMap = new HashMap();
                if (hVar == null) {
                    str = "false";
                } else {
                    str = "true";
                }
                hashMap.put("success", str);
                this.f15656a.g.b(aca.this, hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ReadContactsTask.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f15657a;

        public c(vrp vrpVar) {
            this.f15657a = vrpVar;
        }

        public void a(ReadContactsTask.ContactsModel contactsModel) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e92dd2db", new Object[]{this, contactsModel});
            } else if (this.f15657a.g != null) {
                this.f15657a.g.b(aca.this, contactsModel.toJSONObject());
                List<String> list = contactsModel.phoneNumbers;
                if (list != null) {
                    i = list.size();
                }
                ir9.b("GlobalNativeMessageHandler", "【getUserContacts】contacts data, phoneNumberSize: " + i);
            }
        }
    }

    static {
        t2o.a(468713501);
    }

    public aca(FluidContext fluidContext, Context context) {
        this.g = fluidContext;
        this.h = context;
        this.e = 2;
        E();
        this.i = (IInteractionService) fluidContext.getService(IInteractionService.class);
    }

    public static void K(Context context, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f26762", new Object[]{context, fluidContext});
        } else if (context instanceof Activity) {
            ((IMediaService) fluidContext.getService(IMediaService.class)).setNeedFloatWindow(true);
        }
    }

    public static /* synthetic */ Object ipc$super(aca acaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/globalinteraction/eventhandler/nativ/GlobalNativeMessageHandler");
    }

    public static /* synthetic */ void t(aca acaVar, vrp vrpVar, kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2714d81f", new Object[]{acaVar, vrpVar, hVar});
        } else {
            acaVar.I(vrpVar, hVar);
        }
    }

    public final void C(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b700523", new Object[]{this, vrpVar});
        } else if (vrpVar != null) {
            Map map = vrpVar.h;
            if (!sz3.b(map)) {
                Map z = nwv.z(map.get("extendParameter"), null);
                boolean o = nwv.o(map.get("clearListNextData"), false);
                boolean b2 = ws6.b();
                ir9.b("GlobalNativeMessageHandler", "MSG_REQUEST_RECOMMEND,推荐接口：" + map + ",isClearListNextData:" + o);
                IDataService iDataService = (IDataService) this.g.getService(IDataService.class);
                if (iDataService != null) {
                    if (b2 && o) {
                        iDataService.clearListNextData();
                    }
                    G(false, z, vrpVar);
                }
            }
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b44746", new Object[]{this});
            return;
        }
        ((HashSet) this.f).add("VSMSG_closeRightView");
        ((HashSet) this.f).add("VSMSG_openRightView");
        ((HashSet) this.f).add("VSMSG_onlyTouchWeex");
        ((HashSet) this.f).add("VSMSG_onlyTouchOpenInteract");
        ((HashSet) this.f).add("VSMSG_defaultTouch");
        ((HashSet) this.f).add("VSMSG_addCart");
        ((HashSet) this.f).add("VSMSG_navToUrl");
        ((HashSet) this.f).add("VSMSG_printLog");
        ((HashSet) this.f).add("VSMSG_edgeComputeFeedBack");
        ((HashSet) this.f).add("VSMSG_reRank");
        ((HashSet) this.f).add("VSMSG_playNext");
        ((HashSet) this.f).add("VSMSG_playPre");
        ((HashSet) this.f).add("VSMSG_showFocusView");
        ((HashSet) this.f).add("VSMSG_setForceLoop");
        ((HashSet) this.f).add("VSMSG_lockListView");
        ((HashSet) this.f).add("VSMSG_getMuteState");
        ((HashSet) this.f).add("VSMSG_clickMute");
        ((HashSet) this.f).add("VSMSG_hasShowMuteTips");
        ((HashSet) this.f).add("VSMSG_syncPageMap");
        ((HashSet) this.f).add("VSMSG_syncProcessMap");
        ((HashSet) this.f).add("VSMSG_getPageAggregateLog");
        ((HashSet) this.f).add("VSMSG_getMainList");
        ((HashSet) this.f).add("VSMSG_requestList");
        ((HashSet) this.f).add("VSMSG_requestRecommend");
        ((HashSet) this.f).add("VSMSG_scrollToItem");
        ((HashSet) this.f).add("VSMSG_getCommonMuteState");
        ((HashSet) this.f).add("VSMSG_getGlobalMuteState");
        ((HashSet) this.f).add("VSMSG_stateChanged");
        ((HashSet) this.f).add("VSMSG_mediaCardAnimated");
        ((HashSet) this.f).add("VSMSG_clickExit");
        ((HashSet) this.f).add("VSMSG_getContacts");
        ((HashSet) this.f).add("VSMSG_enableInterceptBack");
        ((HashSet) this.f).add("VSMSG_exitFullPage");
        ((HashSet) this.f).add("VSMSG_getTabbarVisibility");
        ((HashSet) this.f).add("VSMSG_removeAuthorCards");
        ((HashSet) this.f).add("VSMSG_getVibrateSetting");
        ((HashSet) this.f).add("VSMSG_setVibrateSetting");
        ((HashSet) this.f).add("VSMSG_refreshSessionParams");
        ((HashSet) this.f).add("VSMSG_isUnderageMode");
        ((HashSet) this.f).add("VSMSG_getAppearState");
        ((HashSet) this.f).add("VSMSG_getInitEnvOptions");
        ((HashSet) this.f).add(csp.GET_CARD_DATA_NAME);
        ((HashSet) this.f).add("VSMSG_openCompilationsPop");
        ((HashSet) this.f).add("VSMSG_updateCommonTrack");
        ((HashSet) this.f).add("VSMSG_interactionTaskPanelStatusChanged");
        ((HashSet) this.f).add("VSMSG_publishNoticeClicked");
        ((HashSet) this.f).add("VSMSG_getSessionPlayTime");
        ((HashSet) this.f).add(vrp.MSG_HIDE_TABBAR);
        ((HashSet) this.f).add(vrp.MSG_SHOW_TABBAR);
        ((HashSet) this.f).add(csp.PLAY_ACTIVE_CARD_MEDIA_NAME);
        ((HashSet) this.f).add(csp.PAUSE_VIDEO_NAME);
    }

    public final void F(boolean z, Map map, int i, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa929e3", new Object[]{this, new Boolean(z), map, new Integer(i), vrpVar});
            return;
        }
        IDataService iDataService = (IDataService) this.g.getService(IDataService.class);
        if (iDataService != null) {
            iDataService.requestListForCollection(z, map, i, new a(vrpVar));
        }
    }

    public final void G(boolean z, Map map, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c1528c", new Object[]{this, new Boolean(z), map, vrpVar});
            return;
        }
        IDataService iDataService = (IDataService) this.g.getService(IDataService.class);
        if (iDataService != null) {
            iDataService.requestList(z, map, new b(vrpVar));
        }
    }

    public final void I(vrp vrpVar, kon.h hVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c39ad4", new Object[]{this, vrpVar, hVar});
        } else if (vrpVar.g != null) {
            HashMap hashMap = new HashMap();
            if (hVar == null) {
                str = "false";
            } else {
                str = "true";
            }
            hashMap.put("success", str);
            vrpVar.g.b(this, hashMap);
        }
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        return ((HashSet) this.f).contains(vrpVar.c);
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        Object obj;
        char c2;
        boolean z;
        Map map;
        int i;
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
            return;
        }
        Map<? extends String, ? extends Object> map2 = vrpVar.h;
        IFeedsListService iFeedsListService = (IFeedsListService) this.g.getService(IFeedsListService.class);
        IContainerService iContainerService = (IContainerService) this.g.getService(IContainerService.class);
        ISceneConfigService iSceneConfigService = (ISceneConfigService) this.g.getService(ISceneConfigService.class);
        String str = vrpVar.c;
        str.hashCode();
        String str2 = "";
        switch (str.hashCode()) {
            case -2104671207:
                obj = ITrackService.class;
                if (str.equals("VSMSG_onlyTouchWeex")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2003200578:
                obj = ITrackService.class;
                if (str.equals("VSMSG_stateChanged")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1924032964:
                obj = ITrackService.class;
                if (str.equals("VSMSG_openRightView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1775710179:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getMuteState")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1610975460:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getInitEnvOptions")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1596569540:
                obj = ITrackService.class;
                if (str.equals("VSMSG_openCompilationsPop")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1589874150:
                obj = ITrackService.class;
                if (str.equals("VSMSG_reRank")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1340701799:
                obj = ITrackService.class;
                if (str.equals(vrp.MSG_SHOW_TABBAR)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1298205284:
                obj = ITrackService.class;
                if (str.equals("VSMSG_updateCommonTrack")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1178532285:
                obj = ITrackService.class;
                if (str.equals(vrp.MSG_HIDE_TABBAR)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1171627014:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getGlobalMuteState")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1022411886:
                obj = ITrackService.class;
                if (str.equals("VSMSG_requestList")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -785628488:
                obj = ITrackService.class;
                if (str.equals("VSMSG_onlyTouchOpenInteract")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -736075044:
                obj = ITrackService.class;
                if (str.equals("VSMSG_mediaCardAnimated")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -726958853:
                obj = ITrackService.class;
                if (str.equals(csp.GET_CARD_DATA_NAME)) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -661806706:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getContacts")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -623596073:
                obj = ITrackService.class;
                if (str.equals("VSMSG_exitFullPage")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case -460876056:
                obj = ITrackService.class;
                if (str.equals("VSMSG_setVibrateSetting")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -446225527:
                obj = ITrackService.class;
                if (str.equals("VSMSG_lockListView")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -322438921:
                obj = ITrackService.class;
                if (str.equals("VSMSG_syncPageMap")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -315718193:
                obj = ITrackService.class;
                if (str.equals("VSMSG_isUnderageMode")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -242778308:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getSessionPlayTime")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -118747281:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getPageAggregateLog")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case -103028942:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getMainList")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -21086648:
                obj = ITrackService.class;
                if (str.equals("VSMSG_requestRecommend")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 21883554:
                obj = ITrackService.class;
                if (str.equals("VSMSG_playNext")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 37936550:
                obj = ITrackService.class;
                if (str.equals("VSMSG_addCart")) {
                    c2 = JSONLexer.EOI;
                    break;
                }
                c2 = 65535;
                break;
            case 151781064:
                obj = ITrackService.class;
                if (str.equals("VSMSG_setForceLoop")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 167390923:
                obj = ITrackService.class;
                if (str.equals("VSMSG_enableInterceptBack")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 192898425:
                obj = ITrackService.class;
                if (str.equals("VSMSG_removeAuthorCards")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 226633708:
                obj = ITrackService.class;
                if (str.equals("VSMSG_navToUrl")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 408183420:
                obj = ITrackService.class;
                if (str.equals("VSMSG_refreshSessionParams")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case 479276764:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getVibrateSetting")) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 606543819:
                obj = ITrackService.class;
                if (str.equals("VSMSG_clickExit")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case 606779590:
                obj = ITrackService.class;
                if (str.equals("VSMSG_clickMute")) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case 658676539:
                obj = ITrackService.class;
                if (str.equals("VSMSG_publishNoticeClicked")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 663716406:
                obj = ITrackService.class;
                if (str.equals("VSMSG_scrollToItem")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case 693444884:
                obj = ITrackService.class;
                if (str.equals("VSMSG_playPre")) {
                    c2 = WXUtils.PERCENT;
                    break;
                }
                c2 = 65535;
                break;
            case 719015513:
                obj = ITrackService.class;
                if (str.equals("VSMSG_defaultTouch")) {
                    c2 = '&';
                    break;
                }
                c2 = 65535;
                break;
            case 804147109:
                obj = ITrackService.class;
                if (str.equals("VSMSG_showFocusView")) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case 1163145178:
                obj = ITrackService.class;
                if (str.equals("VSMSG_interactionTaskPanelStatusChanged")) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case 1181925389:
                obj = ITrackService.class;
                if (str.equals("VSMSG_hasShowMuteTips")) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case 1271920562:
                obj = ITrackService.class;
                if (str.equals("VSMSG_printLog")) {
                    c2 = '*';
                    break;
                }
                c2 = 65535;
                break;
            case 1347407947:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getTabbarVisibility")) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 1388453763:
                obj = ITrackService.class;
                if (str.equals("VSMSG_syncProcessMap")) {
                    c2 = ',';
                    break;
                }
                c2 = 65535;
                break;
            case 1495606756:
                obj = ITrackService.class;
                if (str.equals("VSMSG_closeRightView")) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case 1674502975:
                obj = ITrackService.class;
                if (str.equals(csp.PLAY_ACTIVE_CARD_MEDIA_NAME)) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 1927154756:
                obj = ITrackService.class;
                if (str.equals("VSMSG_edgeComputeFeedBack")) {
                    c2 = wh6.DIR;
                    break;
                }
                c2 = 65535;
                break;
            case 1977821011:
                obj = ITrackService.class;
                if (str.equals(csp.PAUSE_VIDEO_NAME)) {
                    c2 = '0';
                    break;
                }
                c2 = 65535;
                break;
            case 2097598130:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getCommonMuteState")) {
                    c2 = '1';
                    break;
                }
                c2 = 65535;
                break;
            case 2120494305:
                obj = ITrackService.class;
                if (str.equals("VSMSG_getAppearState")) {
                    c2 = '2';
                    break;
                }
                c2 = 65535;
                break;
            default:
                obj = ITrackService.class;
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case '\f':
                if (iFeedsListService != null) {
                    iFeedsListService.setScrollLockedExternal(true);
                }
                if (iContainerService != null) {
                    iContainerService.setLockedTouchEvent(true);
                }
                if (iSceneConfigService != null) {
                    iSceneConfigService.getSlidePageLockConfigure().b(true);
                    return;
                }
                return;
            case 1:
                if (TextUtils.equals(nwv.I(map2.get("state"), null), "active")) {
                    this.i.setGlobalLayerVisibility(true);
                    return;
                }
                return;
            case 2:
            case 6:
            case '\'':
            case '-':
                return;
            case 3:
            case '1':
                vrp.a aVar = vrpVar.g;
                if (aVar != null) {
                    aVar.b(this, mfj.l(this.g));
                    return;
                }
                return;
            case 4:
                if (vrpVar.g == null) {
                    ir9.b("GlobalNativeMessageHandler", "处理获取初始环境配置的消息，callback为空");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("options", wmi.b(this.g, null));
                vrpVar.g.b(this, hashMap);
                return;
            case 5:
                ir9.b("GlobalNativeMessageHandler", "Native收到点击合集浮层事件");
                ((ICollectionService) this.g.getService(ICollectionService.class)).openForClick();
                break;
            case 7:
                ir9.b("GlobalNativeMessageHandler", "VSMSG_HideBackAndShowBottomTabbar, args=" + vrpVar.h);
                yre.d(this.g, false);
                return;
            case '\b':
                if (map2 != null) {
                    Map<String, String> z2 = nwv.z(map2.get("params"), null);
                    ITrackService iTrackService = (ITrackService) this.g.getService(obj);
                    if (iTrackService != null) {
                        iTrackService.updateCommonTrack(z2);
                        return;
                    }
                    return;
                }
                return;
            case '\t':
                ir9.b("GlobalNativeMessageHandler", "VSMSG_ShowBackAndHideBottomTabbar, args=" + vrpVar.h);
                yre.d(this.g, true);
                return;
            case '\n':
                vrp.a aVar2 = vrpVar.g;
                if (aVar2 != null) {
                    aVar2.b(this, mfj.g(this.g));
                    return;
                }
                return;
            case 11:
                break;
            case '\r':
                this.i.setGlobalLayerVisibility(true);
                return;
            case 14:
                if (vrpVar.g == null) {
                    ir9.b("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，callback为空");
                    return;
                }
                a.d x = x();
                if (x == null) {
                    ir9.b("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，mediaDetail为空");
                    vrpVar.g.b(this, null);
                    return;
                }
                Object json = JSON.toJSON(x.h(this.g));
                if (json == null) {
                    ir9.b("GlobalNativeMessageHandler", "处理获取当前Active卡片数据的消息，mediaDetailObject为空");
                    vrpVar.g.b(this, null);
                    return;
                }
                JSONObject a2 = pqi.a(this.g);
                hxf.a(a2, (JSONObject) json);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) x.c);
                jSONObject.put("data", (Object) a2);
                vrpVar.g.b(this, jSONObject);
                return;
            case 15:
                B(vrpVar);
                return;
            case 16:
            case '!':
                FluidContext fluidContext = this.g;
                if (fluidContext != null) {
                    ((IBackEventService) fluidContext.getService(IBackEventService.class)).handleExitFullPage();
                    return;
                }
                return;
            case 17:
                ir9.b("GlobalNativeMessageHandler", map2 + "--MSG_SET_VIBERATE_SETTING");
                if (map2 != null) {
                    l4w.b(((IMessageService) this.g.getService(IMessageService.class)).getMessageCenter(), this.h, ((Boolean) map2.get("setEnable")).booleanValue());
                    return;
                }
                return;
            case 18:
                boolean o = nwv.o(map2.get("isLocked"), false);
                ir9.b("GlobalNativeMessageHandler", "VSMSG_lockListView; isLocked=" + o);
                if (iFeedsListService != null) {
                    iFeedsListService.setScrollLockedExternal(o);
                    return;
                }
                return;
            case 19:
                mca globalState = iSceneConfigService != null ? iSceneConfigService.getGlobalState() : null;
                if (!(globalState == null || map2 == null)) {
                    globalState.f23939a.putAll(map2);
                    return;
                }
                return;
            case 20:
                ir9.b("GlobalNativeMessageHandler", "MSG_GET_IS_UNDERAGEMODE");
                if (vrpVar.g != null) {
                    HashMap hashMap2 = new HashMap();
                    kgv kgvVar = kgv.INSTANCE;
                    hashMap2.put("isUnderageMode", Boolean.valueOf(kgvVar.h(this.h)));
                    hashMap2.put("isSystemMinors", Boolean.valueOf(kgvVar.g(this.h)));
                    hashMap2.put("minorsAgeLevel", Integer.valueOf(kgvVar.b(this.h)));
                    vrpVar.g.b(this, hashMap2);
                    return;
                }
                return;
            case 21:
                HashMap hashMap3 = new HashMap(1);
                ITrackService iTrackService2 = (ITrackService) this.g.getService(obj);
                if (iTrackService2 != null) {
                    hashMap3.put("sessionPlayTime", String.valueOf(iTrackService2.getSessionPlayTime()));
                }
                ir9.b("GlobalNativeMessageHandler", "VSMSG_getSessionPlayTime, args=" + hashMap3);
                vrpVar.g.b(this, hashMap3);
                return;
            case 22:
                if (vrpVar.g != null) {
                    vrpVar.g.b(this, s19.p(this.g));
                    return;
                }
                return;
            case 23:
                vrp.a aVar3 = vrpVar.g;
                if (aVar3 != null) {
                    aVar3.b(this, z(this.g));
                    return;
                }
                return;
            case 24:
                C(vrpVar);
                return;
            case 25:
                if (iFeedsListService != null) {
                    iFeedsListService.publicNextVideo();
                    return;
                }
                return;
            case 26:
                ((IActivityResultService) this.g.getService(IActivityResultService.class)).navToCartForResult(nwv.I(map2.get("itemId"), null));
                return;
            case 27:
                IMediaService iMediaService = (IMediaService) this.g.getService(IMediaService.class);
                if (iMediaService != null) {
                    int t = nwv.t(map2.get("loop"), -1);
                    if (1 == t) {
                        iMediaService.getConfig().g(true);
                        return;
                    } else if (t == 0) {
                        iMediaService.getConfig().g(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 28:
                FluidContext fluidContext2 = this.g;
                if (fluidContext2 != null) {
                    ((IBackEventService) fluidContext2.getService(IBackEventService.class)).acceptEnableInterceptBackMsg(vrpVar);
                    return;
                }
                return;
            case 29:
                if (map2 != null) {
                    str2 = nwv.I(map2.get("authorId"), str2);
                }
                if (!TextUtils.isEmpty(str2)) {
                    ((IDataService) this.g.getService(IDataService.class)).removeDetailListWithAuthor(str2);
                    return;
                }
                return;
            case 30:
                Object obj2 = map2.get("miniWindow");
                Object obj3 = map2.get("enableSharePlayer");
                Object obj4 = map2.get("url");
                if (obj4 != null) {
                    String obj5 = obj4.toString();
                    if (TextUtils.equals((String) obj3, "1")) {
                        if (l9f.f().l(obj5)) {
                            ((ISharePlayerService) this.g.getService(ISharePlayerService.class)).setEnableInnerSharePlayer(true);
                            obj5 = l9f.f().r(this.g, obj5);
                        }
                    } else if ("1".equals(obj2)) {
                        K(this.h, this.g);
                    }
                    try {
                        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.g.getService(IDataService.class)).getCurrentMediaSetData();
                        if (!(!w() || currentMediaSetData == null || currentMediaSetData.e() == null || currentMediaSetData.e().d == null || currentMediaSetData.e().d.get("transmitParams") == null)) {
                            obj5 = kz3.d().e(this.g, obj5, (JSONObject) currentMediaSetData.e().d.get("transmitParams"));
                        }
                    } catch (Exception e) {
                        ir9.b("GlobalNativeMessageHandler", "合集跳转拦截失败" + e);
                    }
                    Object obj6 = map2.get("nativeParams");
                    if (obj6 instanceof JSONObject) {
                        bundle = new Bundle();
                        for (Map.Entry<String, Object> entry : ((JSONObject) obj6).entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                bundle.putString(key, value.toString());
                            }
                        }
                    } else {
                        bundle = null;
                    }
                    FluidSDK.getNavAdapter().nav(this.g, this.h, obj5, bundle);
                    return;
                }
                return;
            case 31:
                if (iSceneConfigService != null) {
                    iSceneConfigService.refreshSessionParams(map2);
                }
                if (iContainerService != null) {
                    iContainerService.refreshWithCallback(null);
                    return;
                }
                return;
            case ' ':
                ir9.b("GlobalNativeMessageHandler", "--MSG_GET_VIBERATE_SETTING");
                boolean a3 = l4w.a(this.g.getContext());
                HashMap hashMap4 = new HashMap();
                hashMap4.put("enable", Boolean.toString(a3));
                vrpVar.g.b(this, hashMap4);
                return;
            case '\"':
                mfj.c(this.g, map2);
                return;
            case '#':
                ir9.b("GlobalNativeMessageHandler", "VSMSG_publishNoticeClicked, args=" + vrpVar.h);
                IHostTNodeService iHostTNodeService = (IHostTNodeService) this.g.getService(IHostTNodeService.class);
                if (!(iHostTNodeService == null || iHostTNodeService.getTab2ServiceDelegate() == null)) {
                    iHostTNodeService.getTab2ServiceDelegate().f(new JSONObject(vrpVar.h));
                    return;
                }
                return;
            case '$':
                if (map2 != null) {
                    Object obj7 = map2.get("id");
                    if ((obj7 instanceof String) && iFeedsListService != null) {
                        iFeedsListService.scrollToItem((String) obj7);
                        return;
                    }
                    return;
                }
                return;
            case '%':
                if (iFeedsListService != null) {
                    iFeedsListService.publicPreVideo();
                    return;
                }
                return;
            case '&':
                if (iFeedsListService != null) {
                    iFeedsListService.setScrollLockedExternal(false);
                }
                if (iContainerService != null) {
                    iContainerService.setLockedTouchEvent(false);
                }
                if (iSceneConfigService != null) {
                    iSceneConfigService.getSlidePageLockConfigure().b(false);
                    return;
                }
                return;
            case '(':
                ir9.b("GlobalNativeMessageHandler", "VSMSG_interactionTaskPanelStatusChanged, args=" + vrpVar.h);
                u(vrpVar);
                return;
            case ')':
                mfj.n(this.g);
                return;
            case '*':
                String I = map2 != null ? nwv.I(map2.get("tag"), str2) : str2;
                if (map2 != null) {
                    str2 = nwv.I(map2.get("message"), str2);
                }
                if ((map2 != null ? nwv.I(map2.get(m09.TASK_TYPE_LEVEL), "debug") : "debug").equals("debug")) {
                    ir9.a(I, str2);
                    return;
                } else {
                    ir9.b(I, str2);
                    return;
                }
            case '+':
                if (vrpVar.g != null) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("visible", Boolean.valueOf(od0.D().f().C()));
                    vrpVar.g.b(this, hashMap5);
                    return;
                }
                return;
            case ',':
                if (map2 != null) {
                    p91.processMap.putAll(map2);
                    return;
                }
                return;
            case '.':
                ILifecycleService iLifecycleService = (ILifecycleService) this.g.getService(ILifecycleService.class);
                if (!(iFeedsListService == null || iLifecycleService == null)) {
                    uq9 activeCard = iFeedsListService.getActiveCard();
                    int pageState = iLifecycleService.getPageState();
                    ir9.b("GlobalNativeMessageHandler", "VSMSG_playActiveCardMedia, fluidCard=" + activeCard + ", pageState=" + pageState);
                    if ((activeCard instanceof ici) && pageState == 2) {
                        ((ici) activeCard).C0();
                        return;
                    }
                    return;
                }
                return;
            case '/':
                v(map2);
                return;
            case '0':
                if (iFeedsListService != null) {
                    uq9 activeCard2 = iFeedsListService.getActiveCard();
                    ir9.b("GlobalNativeMessageHandler", "VSMSG_playActiveCardMedia, fluidCard=" + activeCard2);
                    if (activeCard2 instanceof ici) {
                        ((ici) activeCard2).B0();
                        return;
                    }
                    return;
                }
                return;
            case '2':
                if (vrpVar.g != null) {
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("appear", Boolean.valueOf(((ILifecycleService) this.g.getService(ILifecycleService.class)).getPageState() == 2));
                    vrpVar.g.b(this, hashMap6);
                    return;
                }
                return;
            default:
                ir9.a("GlobalNativeMessageHandler", "没有处理消息:" + vrpVar.toString());
                return;
        }
        if (map2 != null) {
            Object obj8 = map2.get("isTop");
            z = obj8 instanceof String ? Boolean.valueOf((String) obj8).booleanValue() : false;
            i = nwv.t(map2.get(c4o.COLLECTION_ORDER), -1);
            map = null;
        } else {
            i = -1;
            map = null;
            z = false;
        }
        F(z, map, i, vrpVar);
    }

    public final void v(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba37469e", new Object[]{this, map});
            return;
        }
        aon g = aon.g(((ISceneConfigService) this.g.getService(ISceneConfigService.class)).getSessionParams(), ((IDataService) this.g.getService(IDataService.class)).getConfig().j());
        g.h(map);
        ir9.b("GlobalNativeMessageHandler", "[动态推荐] egPositiveFeedBack args=" + map);
        ((IDataService) this.g.getService(IDataService.class)).dynamicRecommend(g);
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc665332", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableDxViewV3", true);
    }

    public final a.d x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("548daa07", new Object[]{this});
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.g.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null) {
            return currentMediaSetData.e();
        }
        return null;
    }

    public static Map z(FluidContext fluidContext) {
        a.d e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fdf09a5b", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList();
        if (unmodifiableMediaSetList == null) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.android.fluid.framework.data.datamodel.a aVar : unmodifiableMediaSetList) {
            if (!(aVar == null || (e = aVar.e()) == null || (jSONObject = e.d) == null)) {
                arrayList.add(jSONObject);
            }
        }
        hashMap.put("list", arrayList);
        hashMap.put("topHasMore", String.valueOf(!((IDataService) fluidContext.getService(IDataService.class)).isUpNoMoreData()));
        hashMap.put("bottomHasMore", String.valueOf(!((IDataService) fluidContext.getService(IDataService.class)).isDownNoMoreData()));
        return hashMap;
    }

    public final void B(vrp vrpVar) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49bb2a2", new Object[]{this, vrpVar});
            return;
        }
        ir9.b("GlobalNativeMessageHandler", "【getUserContacts】start");
        if (vrpVar == null) {
            ir9.b("GlobalNativeMessageHandler", "message is null");
            return;
        }
        Map map = vrpVar.h;
        if (map != null) {
            try {
                parseInt = Integer.parseInt(String.valueOf(map.get(ReadContactsTask.KEY_MAX_PHONE_NUMBER)));
            } catch (Exception e) {
                ir9.b("GlobalNativeMessageHandler", "【getUserContacts】parse message args error: " + e.toString());
            }
            new ReadContactsTask(this.h, parseInt, new c(vrpVar)).execute(new Void[0]);
            ir9.b("GlobalNativeMessageHandler", "【getUserContacts】end");
        }
        parseInt = 0;
        new ReadContactsTask(this.h, parseInt, new c(vrpVar)).execute(new Void[0]);
        ir9.b("GlobalNativeMessageHandler", "【getUserContacts】end");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
        if (r6.equals("willShow") == false) goto L_0x00a2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(tb.vrp r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aca.u(tb.vrp):void");
    }
}
