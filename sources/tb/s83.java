package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.containerframe.IContainerFrameService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.WeexConsumeLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard;
import com.taobao.android.fluid.framework.card.cards.video.manager.landscape.LandscapeController;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.performance.IPerformanceService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.weex.utils.WXUtils;
import com.uc.webview.export.extension.UCClient;
import com.uc.webview.export.media.CommandID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.vrp;
import tb.x3q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s83 extends vx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Collection<String> n;
    public final mhf g;
    public final FluidContext h;
    public final uq9 i;
    public final ViewGroup j;
    public hg2 k;
    public bib l;
    public boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f27863a;

        public a(vrp vrpVar) {
            this.f27863a = vrpVar;
        }

        @Override // tb.bib
        public void onLoseFocus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4485122b", new Object[]{this});
            }
        }

        @Override // tb.bib
        public boolean onHandleBackKeyEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
            }
            if (this.f27863a.g != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "onbackpressed");
                this.f27863a.g.b(s83.this, hashMap);
            }
            return true;
        }
    }

    static {
        t2o.a(468713916);
        HashSet hashSet = new HashSet();
        n = hashSet;
        hashSet.add("VSMSG_playPlayer");
        hashSet.add("VSMSG_pausePlayer");
        hashSet.add("VSMSG_getComponentFrame");
        hashSet.add("VSMSG_getCommonTrack");
        hashSet.add("VSMSG_getCommonTrackV2");
        hashSet.add("VSMSG_getDPVCommonTrack");
        hashSet.add("VSMSG_clickGoods");
        hashSet.add("VSMSG_positiveFeedBack");
        hashSet.add("VSMSG_getMobileInfo");
        hashSet.add("VSMSG_enableDynamicRecommend");
        hashSet.add("VSMSG_clickDislike");
        hashSet.add("VSMSG_clickCollect");
        hashSet.add("VSMSG_updateSettings");
        hashSet.add("VSMSG_clickReport");
        hashSet.add("VSMSG_clickAutoPlay");
        hashSet.add("VSMSG_settingPanelStateChange");
        hashSet.add("VSMSG_hideCommentList");
        hashSet.add("VSMSG_showHideVideoBlur");
        hashSet.add("VSMSG_cacheVideoSnapshot");
        hashSet.add("VSMSG_showComponentList");
        hashSet.add("VSMSG_setItemRecognizeShowing");
        hashSet.add("VSMSG_toLandscape");
        hashSet.add("VSMSG_removeCard");
        hashSet.add("VSMSG_getListInfo");
        hashSet.add("VSMSG_hookPalyEndEvent");
        hashSet.add("VSMSG_resumePlay");
        hashSet.add("VSMSG_activityCover");
        hashSet.add("VSMSG_refreshForPublisherEdit");
        hashSet.add("VSMSG_refreshCurrentData");
        hashSet.add("VSMSG_getNextListInfo");
        hashSet.add("VSMSG_submitAggregateLog");
        hashSet.add("VSMSG_syncCardMap");
        hashSet.add("VSMSG_getCellAggregateLog");
        hashSet.add("VSMSG_getVideoSize");
        hashSet.add("VSMSG_handleAlbumDetail");
        hashSet.add("VSMSG_screenMove");
        hashSet.add("VSMSG_screenMoveV2");
        hashSet.add("VSMSG_putNextCardMap");
        hashSet.add("VSMSG_getCardMap");
        hashSet.add("VSMSG_getPlayRateV2");
        hashSet.add("VSMSG_setPlayRateV2");
        hashSet.add("VSMSG_getProgressPosition");
        hashSet.add("VSMSG_seekAndPause");
        hashSet.add("VSMSG_updatePageGrayMask");
        hashSet.add("VSMSG_setVisibleTitleBarMore");
        hashSet.add("VSMSG_addRecommendExtendParams");
        hashSet.add("VSMSG_getFeedbackState");
        hashSet.add("VSMSG_animateMediaCard");
        hashSet.add("VSMSG_mediaCardAnimated");
        hashSet.add("VSMSG_setSlideMode");
        hashSet.add("VSMSG_updatePlayerUtParams");
        hashSet.add("VSMSG_immersiveVideo");
        hashSet.add("VSMSG_setPlayerVolume");
        hashSet.add(vrp.MSG_DATA_CHANGE);
        hashSet.add("VSMSG_getNextCollectionVideo");
        hashSet.add("VSMSG_cancelPlayNextCollectionVideo");
        hashSet.add("VSMSG_setTab2WebConfigs");
        hashSet.add("VSMSG_commitUTWithNativeArgs");
        hashSet.add("VSMSG_checkVerticalUI");
        hashSet.add("VSMSG_getPauseBtnPosition");
        hashSet.add("VSMSG_apmTrace");
        hashSet.add("VSMSG_scrollToNextFrame");
        hashSet.add("VSMSG_getAlbumInitStation");
        hashSet.add("VSMSG_wrapTnodec");
        hashSet.add("VSMSG_changeVisibility");
    }

    public s83(mhf mhfVar, uq9 uq9Var, ViewGroup viewGroup) {
        this.g = mhfVar;
        this.j = viewGroup;
        this.e = 2;
        this.i = uq9Var;
        this.h = uq9Var.U();
    }

    public static /* synthetic */ Object ipc$super(s83 s83Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/eventhandler/nativ/CardNativeMessageHandler");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        Object obj;
        char c;
        r8e c2;
        Map map;
        List v;
        g2e trackTint;
        bib bibVar;
        int i;
        int i2;
        int i3;
        String str;
        Cloneable cloneable;
        View moreButton;
        boolean z;
        Boolean bool;
        String f;
        Map<? extends String, ? extends Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
            return;
        }
        kep sessionIdRecorder = ((ICardService) this.i.U().getService(ICardService.class)).getSessionIdRecorder();
        a.d a2 = sessionIdRecorder.a(vrpVar.d);
        miv detailUnlikeRecorder = ((IHostAppService) this.i.U().getService(IHostAppService.class)).getCurrentTabIndex() == 0 ? ((IDataService) this.h.getService(IDataService.class)).getDetailUnlikeRecorder() : null;
        String str2 = i83.g(this.h).f;
        String str3 = vrpVar.c;
        str3.hashCode();
        String str4 = "action";
        String str5 = "false";
        String str6 = "";
        switch (str3.hashCode()) {
            case -2090754321:
                obj = "name";
                if (str3.equals("VSMSG_controlCurrentLivePhoto")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2019862960:
                obj = "name";
                if (str3.equals("VSMSG_getAlbumInitStation")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1918031838:
                obj = "name";
                if (str3.equals("VSMSG_setPlayerVolume")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1605391121:
                obj = "name";
                if (str3.equals("VSMSG_getNextCollectionVideo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1592092351:
                obj = "name";
                if (str3.equals("VSMSG_getVideoSize")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1580106927:
                obj = "name";
                if (str3.equals("VSMSG_getDPVCommonTrack")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1559427523:
                obj = "name";
                if (str3.equals("VSMSG_changeVisibility")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1547049959:
                obj = "name";
                if (str3.equals("VSMSG_positiveFeedBack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1463329941:
                obj = "name";
                if (str3.equals("VSMSG_getComponentFrame")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1456866862:
                obj = "name";
                if (str3.equals("VSMSG_seekAndPause")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1408749573:
                obj = "name";
                if (str3.equals("VSMSG_hookPalyEndEvent")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1363729851:
                obj = "name";
                if (str3.equals("VSMSG_toLandscape")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1245370259:
                obj = "name";
                if (str3.equals("VSMSG_activityCover")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1017871455:
                obj = "name";
                if (str3.equals("VSMSG_setTab2WebConfigs")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -938699734:
                obj = "name";
                if (str3.equals(vrp.MSG_DATA_CHANGE)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -879541144:
                obj = "name";
                if (str3.equals("VSMSG_showHideVideoBlur")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -819757646:
                obj = "name";
                if (str3.equals("VSMSG_settingPanelStateChange")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -784972766:
                obj = "name";
                if (str3.equals("VSMSG_apmTrace")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -774181563:
                obj = "name";
                if (str3.equals("VSMSG_putNextCardMap")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -773130929:
                obj = "name";
                if (str3.equals("VSMSG_removeCard")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -754864317:
                obj = "name";
                if (str3.equals("VSMSG_showComponentList")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -736075044:
                obj = "name";
                if (str3.equals("VSMSG_mediaCardAnimated")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -688342184:
                obj = "name";
                if (str3.equals("VSMSG_clickDislike")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -623144510:
                obj = "name";
                if (str3.equals("VSMSG_getCellAggregateLog")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -592666527:
                obj = "name";
                if (str3.equals("VSMSG_getCommonTrackV2")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -475416940:
                obj = "name";
                if (str3.equals("VSMSG_screenMoveV2")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -422849055:
                obj = "name";
                if (str3.equals("VSMSG_cancelPlayNextCollectionVideo")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case -381695280:
                obj = "name";
                if (str3.equals("VSMSG_playPlayer")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -280411247:
                obj = "name";
                if (str3.equals("VSMSG_getCardMap")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -163340133:
                obj = "name";
                if (str3.equals("VSMSG_immersiveVideo")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -82366589:
                obj = "name";
                if (str3.equals("VSMSG_refreshCurrentData")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 223273020:
                obj = "name";
                if (str3.equals("VSMSG_pausePlayer")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 284602747:
                obj = "name";
                if (str3.equals("VSMSG_setVisibleTitleBarMore")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 334578437:
                obj = "name";
                if (str3.equals("VSMSG_getCommonTrack")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 338032270:
                obj = "name";
                if (str3.equals("VSMSG_animateMediaCard")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 372091402:
                obj = "name";
                if (str3.equals("VSMSG_updatePlayerUtParams")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 869904290:
                obj = "name";
                if (str3.equals("VSMSG_updatePageGrayMask")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 919677479:
                obj = "name";
                if (str3.equals("VSMSG_updateSettings")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                c = 65535;
                break;
            case 942933239:
                obj = "name";
                if (str3.equals("VSMSG_scrollToNextFrame")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 986427968:
                obj = "name";
                if (str3.equals("VSMSG_hideCommentList")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1002047282:
                obj = "name";
                if (str3.equals("VSMSG_wrapTnodec")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1035044054:
                obj = "name";
                if (str3.equals("VSMSG_syncCardMap")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 1056161355:
                obj = "name";
                if (str3.equals("VSMSG_getPlayRateV2")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1064394845:
                obj = "name";
                if (str3.equals("VSMSG_handleAlbumDetail")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1152025098:
                obj = "name";
                if (str3.equals("VSMSG_getPauseBtnPosition")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1250970535:
                obj = "name";
                if (str3.equals("VSMSG_getListInfo")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1293530544:
                obj = "name";
                if (str3.equals("VSMSG_clickAutoPlay")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1298927051:
                obj = "name";
                if (str3.equals("VSMSG_commitUTWithNativeArgs")) {
                    c = wh6.DIR;
                    break;
                }
                c = 65535;
                break;
            case 1420172535:
                obj = "name";
                if (str3.equals("VSMSG_checkVerticalUI")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1550819249:
                obj = "name";
                if (str3.equals("VSMSG_getFeedbackState")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1624573513:
                obj = "name";
                if (str3.equals("VSMSG_clickGoods")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1628163670:
                obj = "name";
                if (str3.equals("VSMSG_addRecommendExtendParams")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1654393339:
                obj = "name";
                if (str3.equals("VSMSG_enableDynamicRecommend")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1830292567:
                obj = "name";
                if (str3.equals("VSMSG_setPlayRateV2")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 1845638616:
                obj = "name";
                if (str3.equals("VSMSG_submitAggregateLog")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 1866586268:
                obj = "name";
                if (str3.equals("VSMSG_resumePlay")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1896745880:
                obj = "name";
                if (str3.equals("VSMSG_cacheVideoSnapshot")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 1933318321:
                obj = "name";
                if (str3.equals("VSMSG_getProgressPosition")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 1939898938:
                obj = "name";
                if (str3.equals("VSMSG_getNextListInfo")) {
                    c = f7l.CONDITION_IF_MIDDLE;
                    break;
                }
                c = 65535;
                break;
            case 1996676381:
                obj = "name";
                if (str3.equals("VSMSG_refreshForPublisherEdit")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 2006206968:
                obj = "name";
                if (str3.equals("VSMSG_screenMove")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 2040831057:
                obj = "name";
                if (str3.equals("VSMSG_setItemRecognizeShowing")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 2122273165:
                obj = "name";
                if (str3.equals("VSMSG_setSlideMode")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            default:
                obj = "name";
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (this.i instanceof PictureAlbumCard) {
                    ir9.b("CardNativeMessageHandler", "VSMSG_controlCurrentLivePhoto -- " + vrpVar.h);
                    ((PictureAlbumCard) this.i).u1(String.valueOf(vrpVar.h.get(str4)));
                    return;
                }
                return;
            case 1:
                uq9 uq9Var = this.i;
                if (uq9Var instanceof PictureAlbumCard) {
                    boolean z2 = ((ILifecycleService) uq9Var.U().getService(ILifecycleService.class)).getPageState() == 2;
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", ((PictureAlbumCard) this.i).F1());
                    HashMap hashMap2 = new HashMap(1);
                    hashMap2.put("interactiveStatus", Boolean.valueOf(true ^ ((PictureAlbumCard) this.i).J1()));
                    hashMap.put("userInteractive", hashMap2);
                    hashMap.put("isPageAppear", Boolean.valueOf(z2));
                    ir9.b("CardNativeMessageHandler", "VSMSG_getAlbumInitStation，cbArgs=" + hashMap);
                    vrpVar.g.b(this, hashMap);
                    return;
                }
                return;
            case 2:
                if (vrpVar.h != null && (this.i instanceof ici) && i83.h()) {
                    float r = nwv.r(vrpVar.h.get("value"), -1);
                    ir9.b("CardNativeMessageHandler", "VSMSG_setPlayerVolume, value=" + r);
                    ((ici) this.i).u(r);
                    return;
                }
                return;
            case 3:
                i83.k(this.h, this, vrpVar);
                return;
            case 4:
                if (!(vrpVar.g == null || (c2 = ((prp) this.i).G1().c()) == null)) {
                    HashMap hashMap3 = new HashMap(4);
                    int i4 = c2.h;
                    int i5 = c2.g;
                    int c3 = f2k.c(this.h);
                    hashMap3.put("videoTop", Float.valueOf(c2.e + c3));
                    hashMap3.put("topHeight", Integer.valueOf(c3));
                    hashMap3.put("videoHeight", Integer.valueOf(i4));
                    hashMap3.put("videoWidth", Integer.valueOf(i5));
                    ir9.a("CardNativeMessageHandler", "MSG_GET_VIDEO_SIZE = " + hashMap3 + " |videoCommentSizeObject=" + c2);
                    vrpVar.g.b(this, hashMap3);
                    return;
                }
                return;
            case 5:
                vrp.a aVar = vrpVar.g;
                if (aVar != null) {
                    aVar.b(this, ((ITrackService) this.i.U().getService(ITrackService.class)).getDPVCommonTrack());
                    return;
                }
                return;
            case 6:
                Map map3 = vrpVar.h;
                if (map3 != null) {
                    try {
                        JSONArray m = nwv.m(map3.get("actions"), null);
                        if (m != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i6 = 0;
                            while (i6 < m.size()) {
                                JSONObject jSONObject = m.getJSONObject(i6);
                                String I = nwv.I(jSONObject.get(str4), str6);
                                String I2 = nwv.I(jSONObject.get("area"), str6);
                                if (!TextUtils.isEmpty(I2)) {
                                    if (!"show".equals(I)) {
                                        if ("hide".equals(I)) {
                                        }
                                    }
                                    if ("show".equals(I)) {
                                        arrayList.add(I2);
                                    } else {
                                        arrayList2.add(I2);
                                    }
                                }
                                i6++;
                                str4 = str4;
                            }
                            ((IContainerService) this.h.getService(IContainerService.class)).changeVisibility(arrayList, arrayList2);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        ir9.c("CardNativeMessageHandler", "VSMSG_CHANGE_VISIBLIITY", e);
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                i83.i(this.h, sessionIdRecorder, vrpVar);
                return;
            case '\b':
                vrp.a aVar2 = vrpVar.g;
                if (aVar2 != null) {
                    aVar2.b(this, i83.e(this.h, this.j, vrpVar.h.get("componentName").toString()));
                    return;
                }
                return;
            case '\t':
                if ((this.i instanceof prp) && (map = vrpVar.h) != null) {
                    ((prp) this.i).n1().w(nwv.t(map.get(CommandID.seekTo), -1), nwv.o(vrpVar.h.get("isPause"), false));
                    this.m = true;
                    return;
                }
                return;
            case '\n':
                ((prp) this.i).S1(nwv.o(vrpVar.h.get(sj4.IS_HOOK_VIDEO_END), false));
                return;
            case 11:
                LandscapeController b = ((prp) this.i).t1().b();
                if (b != null) {
                    b.toLandscape();
                    return;
                }
                return;
            case '\f':
                if (vrpVar.g != null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("coverState", Boolean.valueOf(j7m.a(this.i.U(), (Activity) this.j.getContext())));
                    vrpVar.g.b(this, hashMap4);
                    return;
                }
                return;
            case '\r':
                Map map4 = vrpVar.h;
                if (!(map4 == null || (v = nwv.v(map4.get("configs"), null)) == null || (trackTint = ((ITrackService) this.h.getService(ITrackService.class)).getTrackTint()) == null)) {
                    trackTint.h(vrpVar.f30209a, v);
                    return;
                }
                return;
            case 14:
                i83.b(this.h, vrpVar);
                return;
            case 15:
                if (this.k == null) {
                    this.k = new hg2();
                }
                if ("1".equals(vrpVar.h.get("show"))) {
                    if (this.j instanceof FscrmidFavorFrameLayout) {
                        ((FscrmidFavorFrameLayout) this.j).disableTouch(!"1".equals(vrpVar.h.get("canTouch")));
                    }
                    qn1 backKeyEventDetector = ((IBackEventService) this.h.getService(IBackEventService.class)).getBackKeyEventDetector();
                    if (backKeyEventDetector != null) {
                        bib bibVar2 = this.l;
                        if (bibVar2 != null) {
                            backKeyEventDetector.c(bibVar2);
                        }
                        a aVar3 = new a(vrpVar);
                        this.l = aVar3;
                        backKeyEventDetector.d(aVar3);
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup = this.j;
                if (viewGroup instanceof FscrmidFavorFrameLayout) {
                    ((FscrmidFavorFrameLayout) viewGroup).disableTouch(false);
                }
                qn1 backKeyEventDetector2 = ((IBackEventService) this.h.getService(IBackEventService.class)).getBackKeyEventDetector();
                if (!(backKeyEventDetector2 == null || (bibVar = this.l) == null)) {
                    backKeyEventDetector2.c(bibVar);
                    this.l = null;
                    return;
                }
                return;
            case 16:
                ((IContainerService) this.h.getService(IContainerService.class)).getConfig().s(nwv.o(vrpVar.h.get("isShow"), false));
                return;
            case 17:
                ((IPerformanceService) this.h.getService(IPerformanceService.class)).onInteractAPMTrace(vrpVar.h);
                return;
            case 18:
                Map map5 = vrpVar.h;
                if (map5 != null) {
                    i83.j(this.i, vrpVar, nwv.I(map5.get("contentId"), null), "1".equals(vrpVar.h.get("isUp")), nwv.z(vrpVar.h.get("data"), null));
                    return;
                }
                return;
            case 19:
                Map map6 = vrpVar.h;
                if (map6 != null) {
                    i = -1;
                    i2 = nwv.t(map6.get("index"), -1);
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == i) {
                    i2 = ((IDataService) this.h.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(vrpVar.d));
                }
                ((IDataService) this.h.getService(IDataService.class)).removeDetailListAtIndex(i2);
                return;
            case 20:
                List list = (List) vrpVar.h.get("componentList");
                if (list != null) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        Map map7 = (Map) list.get(i7);
                        String str7 = (String) map7.get(obj);
                        int t = t((String) map7.get("visibility"));
                        if (t >= 0) {
                            if ("topNavBar".equals(str7)) {
                                i3 = ((IContainerService) this.h.getService(IContainerService.class)).getAndSetTopLayoutVisibility(t);
                            } else {
                                if ("progressBar".equals(str7)) {
                                    uq9 uq9Var2 = this.i;
                                    if (uq9Var2 instanceof prp) {
                                        i3 = ((prp) uq9Var2).n1().k(t);
                                    }
                                }
                                i3 = -1;
                            }
                            map7.put("visibility", u(i3));
                        }
                    }
                    vrp.a aVar4 = vrpVar.g;
                    if (aVar4 != null) {
                        aVar4.b(this, vrpVar.h);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ir9.b("CardNativeMessageHandler", "VSMSG_mediaCardAnimated");
                this.g.m();
                return;
            case 22:
                if (a2.C()) {
                    str = a2.O();
                } else {
                    str = a2.f();
                }
                HashMap hashMap5 = new HashMap();
                if (detailUnlikeRecorder.d(str)) {
                    detailUnlikeRecorder.e(str, a2.M(), false);
                    hashMap5.put("dislike", Boolean.FALSE);
                } else {
                    detailUnlikeRecorder.e(str, a2.M(), true);
                    hashMap5.put("dislike", Boolean.TRUE);
                }
                vrp.a aVar5 = vrpVar.g;
                if (aVar5 != null) {
                    aVar5.b(this, hashMap5);
                    return;
                }
                return;
            case 23:
                if (vrpVar.g != null) {
                    vrpVar.g.b(this, s19.m(this.i));
                    return;
                }
                return;
            case 24:
            case '!':
                vrp.a aVar6 = vrpVar.g;
                if (aVar6 != null) {
                    aVar6.b(this, ((ITrackService) this.i.U().getService(ITrackService.class)).getThisCardCommonTrack(this.i));
                    return;
                }
                return;
            case 25:
            case '<':
                Map map8 = vrpVar.h;
                if (map8 != null) {
                    int t2 = nwv.t(map8.get("animDura"), -1);
                    int t3 = nwv.t(vrpVar.h.get("distance"), 0);
                    boolean o = nwv.o(vrpVar.h.get("isAnimate"), false);
                    boolean o2 = nwv.o(vrpVar.h.get("isWeexFollowMove"), false);
                    boolean o3 = nwv.o(vrpVar.h.get("isReset"), false);
                    int S = s6o.S(null, t3);
                    x3q m2 = new x3q.b().s(this.j).k(t2).u(o3 ? -S : 0).o(o).r(o2).t(S).p(o3).q(TextUtils.equals(vrpVar.c, "VSMSG_screenMoveV2")).n(nwv.I(vrpVar.h.get("interpolatorType"), "linear")).l(nwv.I(vrpVar.h.get(vaj.KEY_BG_COLOR), null)).m();
                    if (ngf.c()) {
                        this.i.c0().b(m2);
                    }
                    tvp.i(m2);
                    return;
                }
                return;
            case 26:
                i83.a(this.h, vrpVar);
                return;
            case 27:
                if (!(this.i instanceof prp)) {
                    return;
                }
                if (!akt.p2("ShortVideo.fixCardState", true) || ((ILifecycleService) this.i.U().getService(ILifecycleService.class)).getPageState() == 2) {
                    ((prp) this.i).C0();
                    return;
                } else {
                    ir9.b("CardNativeMessageHandler", "page is not appear, ignore doMediaResume");
                    return;
                }
            case 28:
                Map map9 = vrpVar.h;
                String I3 = map9 != null ? nwv.I(map9.get("key"), null) : null;
                HashMap hashMap6 = new HashMap();
                if (I3 == null) {
                    cloneable = a2.f7801a;
                } else {
                    hashMap6.put(I3, a2.f7801a.get(I3));
                    cloneable = hashMap6;
                }
                vrp.a aVar7 = vrpVar.g;
                if (aVar7 != null) {
                    aVar7.b(this, cloneable);
                    return;
                }
                return;
            case 29:
                Map map10 = vrpVar.h;
                if (map10 != null) {
                    yre.c(this.i.U(), nwv.I(map10.get("type"), str6), nwv.I(vrpVar.h.get("contentId"), str6), nwv.I(vrpVar.h.get("index"), str6), nwv.I(vrpVar.h.get(UCClient.UI_PARAMS_KEY_GESTURE), str6), nwv.I(vrpVar.h.get("currentData"), str6));
                    return;
                }
                return;
            case 30:
            case ';':
                ((IDataService) this.h.getService(IDataService.class)).refreshCurrentData(sessionIdRecorder.b(vrpVar.d), vrpVar.g, this);
                return;
            case 31:
                uq9 uq9Var3 = this.i;
                if (uq9Var3 instanceof ici) {
                    ((ici) uq9Var3).B0();
                    return;
                }
                return;
            case ' ':
                if (!(vrpVar.h == null || (moreButton = ((IContainerService) this.h.getService(IContainerService.class)).getMoreButton()) == null)) {
                    moreButton.setVisibility(nwv.o(vrpVar.h.get("visible"), true) ? 0 : 8);
                    return;
                }
                return;
            case '\"':
                try {
                    qy0 d = w7l.d(this.j.getContext(), new JSONObject(vrpVar.h));
                    uq9 uq9Var4 = this.i;
                    if (uq9Var4 instanceof ici) {
                        ((ici) uq9Var4).k(d);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ir9.b("CardNativeMessageHandler", "MSG_ANIMATE_MEDIACARD, error : " + th.getMessage());
                    return;
                }
            case '#':
                if (vrpVar.h != null && (this.i instanceof ici)) {
                    ir9.b("CardNativeMessageHandler", "VSMSG_updatePlayerUtParams, value=" + vrpVar.h);
                    ((ici) this.i).update12003UtParams(vrpVar.h);
                    return;
                }
                return;
            case '$':
                Map map11 = vrpVar.h;
                if (map11 != null && (this.i instanceof ici)) {
                    if (map11.containsKey("upShow")) {
                        z = false;
                        bool = Boolean.valueOf(nwv.o(map11.get("upShow"), false));
                    } else {
                        z = false;
                        bool = null;
                    }
                    ((ici) this.i).Z0(bool, map11.containsKey("downShow") ? Boolean.valueOf(nwv.o(map11.get("downShow"), z)) : null);
                    break;
                }
                break;
            case '%':
                HashMap hashMap7 = new HashMap();
                hashMap7.put("autoplay", Boolean.valueOf(zk1.e(str2)));
                if (a2.C()) {
                    f = a2.O();
                } else {
                    f = a2.f();
                }
                hashMap7.put("dislike", Boolean.valueOf(detailUnlikeRecorder.d(f)));
                int b2 = zk1.b();
                if (b2 == 1) {
                    str5 = "true";
                } else if (b2 != 2) {
                    str5 = "none";
                }
                hashMap7.put("autoPlaySettingState", str5);
                hashMap7.put(HapticsEngineAbility.API_VIBRATE, Boolean.valueOf(l4w.a(this.h.getContext())));
                uq9 uq9Var5 = this.i;
                if (uq9Var5 instanceof prp) {
                    d6w n1 = ((prp) uq9Var5).n1();
                    hashMap7.put("enablePlayerRate", Boolean.valueOf(n1.L()));
                    hashMap7.put("playRate", n1.t());
                }
                vrp.a aVar8 = vrpVar.g;
                if (aVar8 != null) {
                    aVar8.b(this, hashMap7);
                    return;
                }
                return;
            case '&':
                if (this.i instanceof PictureAlbumCard) {
                    ir9.b("CardNativeMessageHandler", "VSMSG_scrollToNextFrame -- ");
                    ((PictureAlbumCard) this.i).T1();
                    return;
                }
                return;
            case '\'':
                ((IContainerFrameService) this.h.getService(IContainerFrameService.class)).hideCommentFrame();
                return;
            case '(':
                if ("$monitor.apmTrace".equals(vrpVar.h.get(obj))) {
                    ((IPerformanceService) this.h.getService(IPerformanceService.class)).onInteractAPMTrace(mqu.Companion.h(vrpVar.h.get("params"), null));
                    return;
                }
                return;
            case ')':
                if (!(a2 == null || (map2 = vrpVar.h) == null)) {
                    a2.f7801a.putAll(map2);
                    return;
                }
                return;
            case '*':
                if (vrpVar.g != null && (this.i instanceof prp)) {
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put("playRate", ((prp) this.i).n1().t());
                    vrpVar.g.b(this, hashMap8);
                    return;
                }
                return;
            case '+':
                if (vrpVar.h != null) {
                    ((IContainerFrameService) this.h.getService(IContainerFrameService.class)).handleAlbumDetail(new AlbumData(nwv.I(vrpVar.h.get("type"), null), nwv.I(vrpVar.h.get(LogContext.NEED_MOVE), null), nwv.I(vrpVar.h.get("albumPosition"), null)), sessionIdRecorder.b(vrpVar.d));
                    return;
                }
                return;
            case ',':
                if (vrpVar.g != null && (this.i instanceof ici)) {
                    HashMap hashMap9 = new HashMap();
                    v5m I0 = ((ici) this.i).I0();
                    if (I0 != null) {
                        hashMap9.putAll(I0.Z());
                    }
                    ir9.b("CardNativeMessageHandler", "VSMSG_getPauseBtnPosition，cbArgs=" + hashMap9);
                    vrpVar.g.b(this, hashMap9);
                    return;
                }
                return;
            case '-':
                int indexOfList = ((IDataService) this.h.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(vrpVar.d));
                int totalCount = ((IDataService) this.h.getService(IDataService.class)).getTotalCount();
                if (vrpVar.g != null) {
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put("index", Integer.valueOf(indexOfList));
                    hashMap10.put("count", Integer.valueOf(totalCount));
                    vrpVar.g.b(this, hashMap10);
                    return;
                }
                return;
            case '.':
                zk1.f(!zk1.e(str2));
                if (vrpVar.g != null) {
                    HashMap hashMap11 = new HashMap();
                    hashMap11.put("autoplay", Boolean.valueOf(zk1.e(str2)));
                    vrpVar.g.b(this, hashMap11);
                    return;
                }
                return;
            case '/':
                i83.c(this.i, vrpVar);
                return;
            case '0':
                vrp.a aVar9 = vrpVar.g;
                if (aVar9 != null) {
                    aVar9.b(this, Boolean.valueOf(b93.n(this.h)));
                    return;
                }
                return;
            case '1':
                try {
                    if (!(vrpVar.h == null || vrpVar.g == null)) {
                        iaw detailVideoPositiveFeedbackIdsModel = ((IDataService) this.h.getService(IDataService.class)).getDetailVideoPositiveFeedbackIdsModel();
                        String O = a2.O();
                        if (TextUtils.isEmpty(O)) {
                            O = a2.f();
                        }
                        boolean z3 = detailVideoPositiveFeedbackIdsModel != null && detailVideoPositiveFeedbackIdsModel.b(O);
                        HashMap hashMap12 = new HashMap();
                        hashMap12.put("state", z3 ? "true" : str5);
                        vrpVar.g.b(this, hashMap12);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ir9.b("CardNativeMessageHandler", "MSG_GET_FEEDBACK_STATE, error : " + th2.getMessage());
                    return;
                }
            case '2':
                Map map12 = vrpVar.h;
                ((IContainerFrameService) this.h.getService(IContainerFrameService.class)).onGoodsClick(sessionIdRecorder.a(vrpVar.d), map12 != null ? nwv.I(map12.get("url"), null) : null);
                return;
            case '3':
                try {
                    if (vrpVar.h != null) {
                        ((IDataService) this.h.getService(IDataService.class)).updateAppendRecommenParams(new JSONObject(vrpVar.h));
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    ir9.b("CardNativeMessageHandler", "MSG_ADD_RECOMMEND_EXTENDPARAMS, error : " + th3.getMessage());
                    return;
                }
            case '4':
                String I4 = nwv.I(vrpVar.h.get("id"), null);
                String I5 = nwv.I(vrpVar.h.get("state"), null);
                ir9.b("CardNativeMessageHandler", "disableDynamicRecommend VSMSG_enableDynamicRecommend noDynamicContentId=" + I4 + " noDynamicState=" + I5);
                ((IDataService) this.h.getService(IDataService.class)).updateNoDynamicRecContents(I4, "disable".equals(I5));
                return;
            case '5':
                Map map13 = vrpVar.h;
                if (!(map13 == null || vrpVar.g == null || !(this.i instanceof prp))) {
                    ((prp) this.i).n1().j(nwv.I(map13.get("playRate"), i6m.DEFAULT_PLAY_RATE));
                    vrpVar.g.b(this, Boolean.TRUE);
                    return;
                }
                return;
            case '6':
                try {
                    String I6 = nwv.I(vrpVar.h.get("lid"), null);
                    String I7 = nwv.I(vrpVar.h.get("type"), null);
                    String I8 = nwv.I(vrpVar.h.get(obj), null);
                    Map z4 = nwv.z(vrpVar.h.get("props"), null);
                    Map z5 = nwv.z(vrpVar.h.get("ext"), null);
                    ir9.b("CardNativeMessageHandler", "VSMSG_submitAggregateLog,   " + I6 + ", " + I7 + ", " + I8 + ", " + z4 + ", " + z5);
                    s19.i(this.i, I6, I7, I8, z4, z5);
                    return;
                } catch (Exception e2) {
                    ir9.b("CardNativeMessageHandler", "VSMSG_submitAggregateLog, error : " + e2.getMessage());
                    return;
                }
            case '7':
                ((prp) this.i).n1().C();
                return;
            case '8':
                String b3 = pcw.b(((prp) this.i).G1().c(), this.j);
                this.m = false;
                if (vrpVar.g != null) {
                    HashMap hashMap13 = new HashMap();
                    if (b3 != null) {
                        hashMap13.put("key", b3);
                        hashMap13.put("state", "1");
                    } else {
                        hashMap13.put("state", "0");
                    }
                    vrpVar.g.b(this, hashMap13);
                    return;
                }
                return;
            case '9':
                if (vrpVar.g != null) {
                    uq9 uq9Var6 = this.i;
                    if (uq9Var6 instanceof prp) {
                        str6 = ((prp) uq9Var6).y1().a0();
                    } else if (uq9Var6 instanceof PictureAlbumCard) {
                        str6 = ((PictureAlbumCard) uq9Var6).H1();
                    }
                    ir9.b("CardNativeMessageHandler", "VSMSG_getProgressPosition，positionState=" + str6 + "," + this.i.X());
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put("position", str6);
                    vrpVar.g.b(this, hashMap14);
                    return;
                }
                return;
            case ':':
                if (vrpVar.g != null) {
                    try {
                        int indexOfList2 = ((IDataService) this.h.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(vrpVar.d));
                        HashMap hashMap15 = new HashMap();
                        List unmodifiableMediaSetList = ((IDataService) this.h.getService(IDataService.class)).getUnmodifiableMediaSetList();
                        if (!(unmodifiableMediaSetList == null || indexOfList2 == -1)) {
                            int i8 = indexOfList2 + 1;
                            if (i8 == ((IDataService) this.h.getService(IDataService.class)).getTotalCount()) {
                                vrpVar.g.b(this, hashMap15);
                                return;
                            }
                            a.d g = ((com.taobao.android.fluid.framework.data.datamodel.a) unmodifiableMediaSetList.get(i8)).g(0);
                            JSONObject jSONObject2 = new JSONObject();
                            if (g != null) {
                                jSONObject2.putAll(g.d);
                                jSONObject2.put("cardMap", (Object) g.f7801a);
                            }
                            hashMap15.put("nextListInfo", jSONObject2);
                            vrpVar.g.b(this, hashMap15);
                            return;
                        }
                        vrpVar.g.b(this, hashMap15);
                        return;
                    } catch (Throwable th4) {
                        ir9.c("CardNativeMessageHandler", str6, th4);
                        return;
                    }
                } else {
                    return;
                }
            case '=':
                ((ISceneConfigService) this.h.getService(ISceneConfigService.class)).setItemRecognizeShowing(nwv.o(vrpVar.h.get("isShow"), false));
                return;
            case '>':
                Map map14 = vrpVar.h;
                if (map14 != null) {
                    ViewGroup viewGroup2 = this.j;
                    if (viewGroup2 instanceof WeexConsumeLayout) {
                        ((WeexConsumeLayout) viewGroup2).setLockList(nwv.o(map14.get("lockList"), false));
                        return;
                    }
                    return;
                }
                return;
        }
        ir9.a("CardNativeMessageHandler", "没有处理消息:" + vrpVar.toString());
    }

    public final String u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be60f93d", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "visible";
        }
        if (i == 4) {
            return "invisible";
        }
        if (i == 8) {
            return "gone";
        }
        return "";
    }

    public final int t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4d92fc7", new Object[]{this, str})).intValue();
        }
        if ("visible".equals(str)) {
            return 0;
        }
        if ("gone".equals(str)) {
            return 8;
        }
        return "invisible".equals(str) ? 4 : -1;
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        return "web".equals(vrpVar.b) ? ((HashSet) n).contains(vrpVar.c) && l(vrpVar.d) : ((HashSet) n).contains(vrpVar.c) && vrpVar.d.equals(this.b);
    }
}
