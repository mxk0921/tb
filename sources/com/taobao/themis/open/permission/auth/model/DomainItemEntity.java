package com.taobao.themis.open.permission.auth.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017¨\u0006%"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/DomainItemEntity;", "Ljava/io/Serializable;", "<init>", "()V", "", "domainKey", "Ljava/lang/String;", "getDomainKey", "()Ljava/lang/String;", "setDomainKey", "(Ljava/lang/String;)V", "domainName", "getDomainName", "setDomainName", "status", "getStatus", "setStatus", "tipLabel", "getTipLabel", "setTipLabel", "", "isChanged", "Z", "()Z", "setChanged", "(Z)V", "", "Lcom/taobao/themis/open/permission/auth/model/ResourceItemEntity;", "resourceItems", "Ljava/util/List;", "getResourceItems", "()Ljava/util/List;", "setResourceItems", "(Ljava/util/List;)V", "isAuthed", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DomainItemEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TYPE_ACCEPT = "accept";
    public static final String TYPE_REGECT = "reject";
    private String domainKey;
    private String domainName;
    private boolean isChanged;
    private List<ResourceItemEntity> resourceItems;
    private String status;
    private String tipLabel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055339);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055338);
    }

    public final String getDomainKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23f49fd4", new Object[]{this});
        }
        return this.domainKey;
    }

    public final String getDomainName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14c9f6b4", new Object[]{this});
        }
        return this.domainName;
    }

    public final List<ResourceItemEntity> getResourceItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a56028c4", new Object[]{this});
        }
        return this.resourceItems;
    }

    public final String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.status;
    }

    public final String getTipLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("999ab9ca", new Object[]{this});
        }
        return this.tipLabel;
    }

    public final boolean isAuthed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1606261c", new Object[]{this})).booleanValue();
        }
        return ckf.b("accept", this.status);
    }

    public final boolean isChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("497d09b5", new Object[]{this})).booleanValue();
        }
        return this.isChanged;
    }

    public final void setChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac17a7b", new Object[]{this, new Boolean(z)});
        } else {
            this.isChanged = z;
        }
    }

    public final void setDomainKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdd168a", new Object[]{this, str});
        } else {
            this.domainKey = str;
        }
    }

    public final void setDomainName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5e6742", new Object[]{this, str});
        } else {
            this.domainName = str;
        }
    }

    public final void setResourceItems(List<ResourceItemEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5455aa88", new Object[]{this, list});
        } else {
            this.resourceItems = list;
        }
    }

    public final void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }

    public final void setTipLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499d9ec", new Object[]{this, str});
        } else {
            this.tipLabel = str;
        }
    }
}
