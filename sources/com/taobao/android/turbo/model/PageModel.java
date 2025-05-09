package com.taobao.android.turbo.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.i04;
import tb.mqu;
import tb.t2o;
import tb.tpu;
import tb.yz3;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0017R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b1\u0010.\"\u0004\b2\u00100¨\u00065"}, d2 = {"Lcom/taobao/android/turbo/model/PageModel;", "", "<init>", "()V", "", "getSelectedTabId", "()Ljava/lang/String;", "", "getSelectedTabIndex", "()I", "", "getTabIds", "()Ljava/util/List;", "version", TLogTracker.LEVEL_INFO, "getVersion", "setVersion", "(I)V", "Lcom/taobao/android/turbo/model/TabModel;", "tabs", "Ljava/util/List;", "getTabs", "setTabs", "(Ljava/util/List;)V", "", "Lcom/taobao/android/turbo/model/DrawerModel$DrawerGravity;", "Lcom/taobao/android/turbo/model/DrawerModel;", "drawers", "Ljava/util/Map;", "getDrawers", "()Ljava/util/Map;", "setDrawers", "(Ljava/util/Map;)V", "Lcom/taobao/android/turbo/model/UserModel;", "user", "Lcom/taobao/android/turbo/model/UserModel;", "getUser", "()Lcom/taobao/android/turbo/model/UserModel;", "setUser", "(Lcom/taobao/android/turbo/model/UserModel;)V", "capsuleMsg", "getCapsuleMsg", "setCapsuleMsg", "", "isCache", "Z", "()Z", "setCache", "(Z)V", "isLocal", "setLocal", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PageModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    @JSONField(serialize = false)
    private Map<String, ? extends Object> capsuleMsg;
    private Map<DrawerModel.DrawerGravity, DrawerModel> drawers;
    @JSONField(serialize = false)
    private boolean isCache;
    @JSONField(serialize = false)
    private boolean isLocal;
    private List<TabModel> tabs;
    @JSONField(serialize = false)
    private UserModel user;
    private int version = 2000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455479);
        }

        public a() {
        }

        public final PageModel a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageModel) ipChange.ipc$dispatch("a6cf951e", new Object[]{this, map});
            }
            ckf.g(map, "data");
            List<TabModel> a2 = TabModel.Companion.a(map.get("topTabConfigs"));
            if (a2 == null) {
                return null;
            }
            PageModel pageModel = new PageModel();
            pageModel.setTabs(a2);
            pageModel.setDrawers(DrawerModel.Companion.d((TabModel) i04.m0(a2)));
            pageModel.setUser(UserModel.Companion.a(map));
            pageModel.setCapsuleMsg(mqu.Companion.h(map.get("capsuleMsg"), null));
            return pageModel;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455478);
    }

    public final Map<String, Object> getCapsuleMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b5cba06", new Object[]{this});
        }
        return this.capsuleMsg;
    }

    public final Map<DrawerModel.DrawerGravity, DrawerModel> getDrawers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8683fce8", new Object[]{this});
        }
        return this.drawers;
    }

    @JSONField(serialize = false)
    public final String getSelectedTabId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82483a5a", new Object[]{this});
        }
        List<TabModel> list = this.tabs;
        if (list != null) {
            ckf.d(list);
            return list.get(getSelectedTabIndex()).getId();
        }
        tpu.a.b(tpu.Companion, "PageModel", "tabs is null", null, 4, null);
        return "video";
    }

    @JSONField(serialize = false)
    public final List<String> getTabIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8eb58867", new Object[]{this});
        }
        List<TabModel> list = this.tabs;
        if (list == null) {
            return yz3.i();
        }
        List<TabModel> list2 = list;
        ArrayList arrayList = new ArrayList(zz3.q(list2, 10));
        for (TabModel tabModel : list2) {
            arrayList.add(tabModel.getId());
        }
        return arrayList;
    }

    public final List<TabModel> getTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e58aa66c", new Object[]{this});
        }
        return this.tabs;
    }

    public final UserModel getUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserModel) ipChange.ipc$dispatch("a5a12489", new Object[]{this});
        }
        return this.user;
    }

    public final int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public final boolean isCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252be503", new Object[]{this})).booleanValue();
        }
        return this.isCache;
    }

    public final boolean isLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe54f86c", new Object[]{this})).booleanValue();
        }
        return this.isLocal;
    }

    public final void setCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4b76ed", new Object[]{this, new Boolean(z)});
        } else {
            this.isCache = z;
        }
    }

    public final void setCapsuleMsg(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3f2c48", new Object[]{this, map});
        } else {
            this.capsuleMsg = map;
        }
    }

    public final void setDrawers(Map<DrawerModel.DrawerGravity, DrawerModel> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317bfd3e", new Object[]{this, map});
        } else {
            this.drawers = map;
        }
    }

    public final void setLocal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6744d0a4", new Object[]{this, new Boolean(z)});
        } else {
            this.isLocal = z;
        }
    }

    public final void setTabs(List<TabModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56510678", new Object[]{this, list});
        } else {
            this.tabs = list;
        }
    }

    public final void setUser(UserModel userModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2330f20f", new Object[]{this, userModel});
        } else {
            this.user = userModel;
        }
    }

    public final void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    @JSONField(serialize = false)
    public final int getSelectedTabIndex() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9718fee8", new Object[]{this})).intValue();
        }
        List<TabModel> list = this.tabs;
        if (list != null) {
            ckf.d(list);
            Iterator<TabModel> it = list.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (it.next().getSelected()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                return i2;
            }
            List<TabModel> list2 = this.tabs;
            ckf.d(list2);
            Iterator<TabModel> it2 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (ckf.b(it2.next().getId(), "video")) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (i >= 0) {
                return i;
            }
            return 0;
        }
        tpu.a.b(tpu.Companion, "PageModel", "tabs is null", null, 4, null);
        return 0;
    }
}
