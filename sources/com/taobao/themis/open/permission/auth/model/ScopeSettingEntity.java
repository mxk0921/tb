package com.taobao.themis.open.permission.auth.model;

import com.ali.user.open.core.util.ParamsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/ScopeSettingEntity;", "Ljava/io/Serializable;", "<init>", "()V", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", ParamsConstants.Key.PARAM_SCENE_CODE, "getSceneCode", "setSceneCode", "type", NetworkAbility.API_GET_TYPE, "setType", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeEntity;", "scopes", "Ljava/util/List;", "getScopes", "()Ljava/util/List;", "setScopes", "(Ljava/util/List;)V", "Lcom/taobao/themis/open/permission/auth/model/DomainItemEntity;", "domainItems", "getDomainItems", "setDomainItems", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ScopeSettingEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TYPE_PLATFORM = "platform";
    public static final String TYPE_RESOURCE = "resource";
    public static final String TYPE_SCOPE = "top";
    private List<DomainItemEntity> domainItems;
    private String sceneCode;
    private List<ScopeEntity> scopes;
    private String title;
    private String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055344);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055343);
    }

    public final List<DomainItemEntity> getDomainItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54135cfa", new Object[]{this});
        }
        return this.domainItems;
    }

    public final String getSceneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this});
        }
        return this.sceneCode;
    }

    public final List<ScopeEntity> getScopes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5205852b", new Object[]{this});
        }
        return this.scopes;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public final void setDomainItems(List<DomainItemEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68f8a12", new Object[]{this, list});
        } else {
            this.domainItems = list;
        }
    }

    public final void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.sceneCode = str;
        }
    }

    public final void setScopes(List<ScopeEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b923ec99", new Object[]{this, list});
        } else {
            this.scopes = list;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }
}
