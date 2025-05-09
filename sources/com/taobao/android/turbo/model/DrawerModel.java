package com.taobao.android.turbo.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.utils.DeviceUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.jpu;
import tb.t2o;
import tb.ud0;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/turbo/model/DrawerModel;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "<init>", "()V", "", "width", TLogTracker.LEVEL_INFO, "getWidth", "()I", "setWidth", "(I)V", "", "", "extendParams", "Ljava/util/Map;", "getExtendParams", "()Ljava/util/Map;", "setExtendParams", "(Ljava/util/Map;)V", "Companion", "a", "DrawerGravity", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DrawerModel extends BaseSubPageComponent.SubPageModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LEFT_DRAWER_ID = "sideProfile";
    private static final String LEFT_DRAWER_TNODE_TYPE = "node";
    private static final String LEFT_DRAWER_TNODE_URL = "page_guangguangsideprofile";
    private static final String LEFT_DRAWER_WEEX_DEFAULT_URL = "https://web.m.taobao.com/app/mtb-guang/guangguangsideprofile/home?wh_weex=true&weex_mode=dom&disableNav=YES&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true";
    private static final String LEFT_DRAWER_WEEX_TYPE = "weex";
    private static final int LEFT_DRAWER_WIDTH = 656;
    private static final String RIGHT_DRAWER_ID = "sideLive";
    private static final String RIGHT_DRAWER_TYPE = "node";
    private static final String RIGHT_DRAWER_URL = "page_guangguangsidelive";
    private static final int RIGHT_DRAWER_WIDTH = 656;
    private static List<String> availableDrawerIdList;
    private static DrawerModel leftDrawerData;
    private static DrawerModel rightDrawerData;
    public Map<String, String> extendParams;
    private int width;
    public static final a Companion = new a(null);
    private static final String LEFT_DRAWER_PAGE_NAME = "Page_MySideBar";
    private static final String LEFT_DRAWER_SPM = "a21afv.b29798965";
    private static final Map<String, String> LEFT_DRAWER_EXTENDS_PARAMS = kotlin.collections.a.j(jpu.a("pagewidth", "656"), jpu.a(Component.KEY_PAGE_NAME, LEFT_DRAWER_PAGE_NAME), jpu.a("spm", LEFT_DRAWER_SPM), jpu.a("version", "1"));
    private static final String RIGHT_DRAWER_PAGE_NAME = "Page_TaobaoLiveWatchDiscover";
    private static final String RIGHT_DRAWER_SPM = "a21afv.29303480";
    private static final Map<String, String> RIGHT_DRAWER_EXTENDS_PARAMS = kotlin.collections.a.j(jpu.a("pagewidth", "656"), jpu.a(Component.KEY_PAGE_NAME, RIGHT_DRAWER_PAGE_NAME), jpu.a("spm", RIGHT_DRAWER_SPM));

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/turbo/model/DrawerModel$DrawerGravity;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum DrawerGravity {
        LEFT,
        RIGHT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DrawerGravity drawerGravity, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/model/DrawerModel$DrawerGravity");
        }

        public static DrawerGravity valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("fe432da5", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(DrawerGravity.class, str);
            }
            return (DrawerGravity) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455476);
        }

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6e587a45", new Object[]{this});
            }
            return (String) ud0.Companion.b().b("guangguang.drawerConfig.availableDrawerIds", "sideProfile,sideLive");
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("185558f9", new Object[]{this});
            }
            return (String) ud0.Companion.b().c("weitao_switch.leftDrawerWeexURL", DrawerModel.LEFT_DRAWER_WEEX_DEFAULT_URL);
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a121b4dd", new Object[]{this})).booleanValue();
            }
            return ((Boolean) ud0.Companion.b().b("guangguang.leftDrawerConfig.isEnableLeftDrawerWeexVersion", Boolean.FALSE)).booleanValue();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Map<DrawerGravity, DrawerModel> d(TabModel tabModel) {
            Pair pair;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("978c2083", new Object[]{this, tabModel});
            }
            List access$getAvailableDrawerIdList$cp = DrawerModel.access$getAvailableDrawerIdList$cp();
            if (access$getAvailableDrawerIdList$cp == null) {
                access$getAvailableDrawerIdList$cp = wsq.z0(a(), new String[]{","}, false, 0, 6, null);
                DrawerModel.access$setAvailableDrawerIdList$cp(access$getAvailableDrawerIdList$cp);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (access$getAvailableDrawerIdList$cp.contains(DrawerModel.LEFT_DRAWER_ID)) {
                if (c()) {
                    pair = jpu.a("weex", b());
                } else {
                    pair = jpu.a("node", DrawerModel.LEFT_DRAWER_TNODE_URL);
                }
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                DrawerModel access$getLeftDrawerData$cp = DrawerModel.access$getLeftDrawerData$cp();
                if (access$getLeftDrawerData$cp == null) {
                    access$getLeftDrawerData$cp = new DrawerModel(null);
                    access$getLeftDrawerData$cp.setId(DrawerModel.LEFT_DRAWER_ID);
                    access$getLeftDrawerData$cp.setType(str);
                    access$getLeftDrawerData$cp.setUrl(str2);
                    access$getLeftDrawerData$cp.setPageName(DrawerModel.LEFT_DRAWER_PAGE_NAME);
                    access$getLeftDrawerData$cp.setSpm(DrawerModel.LEFT_DRAWER_SPM);
                    access$getLeftDrawerData$cp.setWidth(656);
                    access$getLeftDrawerData$cp.setExtendParams(DrawerModel.access$getLEFT_DRAWER_EXTENDS_PARAMS$cp());
                    DrawerModel.access$setLeftDrawerData$cp(access$getLeftDrawerData$cp);
                }
                linkedHashMap.put(DrawerGravity.LEFT, access$getLeftDrawerData$cp);
            }
            if (tabModel != null && tabModel.isLive() && !DeviceUtil.Companion.g() && access$getAvailableDrawerIdList$cp.contains(DrawerModel.RIGHT_DRAWER_ID)) {
                DrawerModel access$getRightDrawerData$cp = DrawerModel.access$getRightDrawerData$cp();
                if (access$getRightDrawerData$cp == null) {
                    access$getRightDrawerData$cp = new DrawerModel(null);
                    access$getRightDrawerData$cp.setId(DrawerModel.RIGHT_DRAWER_ID);
                    access$getRightDrawerData$cp.setType("node");
                    access$getRightDrawerData$cp.setUrl(DrawerModel.RIGHT_DRAWER_URL);
                    access$getRightDrawerData$cp.setPageName(DrawerModel.RIGHT_DRAWER_PAGE_NAME);
                    access$getRightDrawerData$cp.setSpm(DrawerModel.RIGHT_DRAWER_SPM);
                    access$getRightDrawerData$cp.setWidth(656);
                    access$getRightDrawerData$cp.setExtendParams(DrawerModel.access$getRIGHT_DRAWER_EXTENDS_PARAMS$cp());
                    DrawerModel.access$setRightDrawerData$cp(access$getRightDrawerData$cp);
                }
                linkedHashMap.put(DrawerGravity.RIGHT, access$getRightDrawerData$cp);
            }
            return linkedHashMap;
        }
    }

    private DrawerModel() {
    }

    public static final /* synthetic */ List access$getAvailableDrawerIdList$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a265f8c", new Object[0]);
        }
        return availableDrawerIdList;
    }

    public static final /* synthetic */ Map access$getLEFT_DRAWER_EXTENDS_PARAMS$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c0440f55", new Object[0]);
        }
        return LEFT_DRAWER_EXTENDS_PARAMS;
    }

    public static final /* synthetic */ DrawerModel access$getLeftDrawerData$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel) ipChange.ipc$dispatch("c558cc37", new Object[0]);
        }
        return leftDrawerData;
    }

    public static final /* synthetic */ Map access$getRIGHT_DRAWER_EXTENDS_PARAMS$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6992092c", new Object[0]);
        }
        return RIGHT_DRAWER_EXTENDS_PARAMS;
    }

    public static final /* synthetic */ DrawerModel access$getRightDrawerData$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel) ipChange.ipc$dispatch("7415720", new Object[0]);
        }
        return rightDrawerData;
    }

    public static final /* synthetic */ void access$setAvailableDrawerIdList$cp(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97197358", new Object[]{list});
        } else {
            availableDrawerIdList = list;
        }
    }

    public static final /* synthetic */ void access$setLeftDrawerData$cp(DrawerModel drawerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187a1055", new Object[]{drawerModel});
        } else {
            leftDrawerData = drawerModel;
        }
    }

    public static final /* synthetic */ void access$setRightDrawerData$cp(DrawerModel drawerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dc824", new Object[]{drawerModel});
        } else {
            rightDrawerData = drawerModel;
        }
    }

    public static /* synthetic */ Object ipc$super(DrawerModel drawerModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/model/DrawerModel");
    }

    public final Map<String, String> getExtendParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cd0258b2", new Object[]{this});
        }
        Map<String, String> map = this.extendParams;
        if (map != null) {
            return map;
        }
        ckf.y("extendParams");
        throw null;
    }

    public final int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.width;
    }

    public final void setExtendParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a887961c", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.extendParams = map;
    }

    public final void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.width = i;
        }
    }

    public /* synthetic */ DrawerModel(a07 a07Var) {
        this();
    }

    static {
        t2o.a(916455475);
    }
}
