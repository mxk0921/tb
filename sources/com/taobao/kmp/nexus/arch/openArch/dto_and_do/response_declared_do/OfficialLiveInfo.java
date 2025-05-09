package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bK\b\u0001\u0018\u0000 O2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001PB\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR/\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR/\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR/\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR/\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR/\u00106\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR/\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\t\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\rR/\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\t\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR/\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010\rR/\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\t\u001a\u0004\bD\u0010\u000b\"\u0004\bE\u0010\rR/\u0010J\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\t\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR/\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\t\u001a\u0004\bL\u0010\u000b\"\u0004\bM\u0010\r¨\u0006Q"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/OfficialLiveInfo;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "officialLive$delegate", "Ltb/qjg;", "getOfficialLive", "()Ljava/lang/String;", "setOfficialLive", "(Ljava/lang/String;)V", "officialLive", "officialHeadImg$delegate", "getOfficialHeadImg", "setOfficialHeadImg", "officialHeadImg", "accountName$delegate", "getAccountName", "setAccountName", "accountName", "activityName$delegate", "getActivityName", "setActivityName", "activityName", "officialLiveId$delegate", "getOfficialLiveId", "setOfficialLiveId", "officialLiveId", "encryptAnchorId$delegate", "getEncryptAnchorId", "setEncryptAnchorId", "encryptAnchorId", "accountId$delegate", "getAccountId", "setAccountId", "accountId", "activityStatus$delegate", "getActivityStatus", "setActivityStatus", "activityStatus", "pvCount$delegate", "getPvCount", "setPvCount", "pvCount", "location$delegate", "getLocation", "setLocation", "location", "officialLiveTopic$delegate", "getOfficialLiveTopic", "setOfficialLiveTopic", "officialLiveTopic", "follow$delegate", "getFollow", "setFollow", "follow", "vicons$delegate", "getVicons", "setVicons", "vicons", "viconInfos$delegate", "getViconInfos", "setViconInfos", "viconInfos", "itemNoBeaty$delegate", "getItemNoBeaty", "setItemNoBeaty", "itemNoBeaty", "officialLiveIcon$delegate", "getOfficialLiveIcon", "setOfficialLiveIcon", "officialLiveIcon", "officialLiveAtmosphereLottieUrl$delegate", "getOfficialLiveAtmosphereLottieUrl", "setOfficialLiveAtmosphereLottieUrl", "officialLiveAtmosphereLottieUrl", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OfficialLiveInfo extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg officialLive$delegate = new qjg(null, this, OfficialLiveInfo$officialLive$2.INSTANCE);
    private final qjg officialHeadImg$delegate = new qjg(null, this, OfficialLiveInfo$officialHeadImg$2.INSTANCE);
    private final qjg accountName$delegate = new qjg(null, this, OfficialLiveInfo$accountName$2.INSTANCE);
    private final qjg activityName$delegate = new qjg(null, this, OfficialLiveInfo$activityName$2.INSTANCE);
    private final qjg officialLiveId$delegate = new qjg(null, this, OfficialLiveInfo$officialLiveId$2.INSTANCE);
    private final qjg encryptAnchorId$delegate = new qjg(null, this, OfficialLiveInfo$encryptAnchorId$2.INSTANCE);
    private final qjg accountId$delegate = new qjg(null, this, OfficialLiveInfo$accountId$2.INSTANCE);
    private final qjg activityStatus$delegate = new qjg(null, this, OfficialLiveInfo$activityStatus$2.INSTANCE);
    private final qjg pvCount$delegate = new qjg(null, this, OfficialLiveInfo$pvCount$2.INSTANCE);
    private final qjg location$delegate = new qjg(null, this, OfficialLiveInfo$location$2.INSTANCE);
    private final qjg officialLiveTopic$delegate = new qjg(null, this, OfficialLiveInfo$officialLiveTopic$2.INSTANCE);
    private final qjg follow$delegate = new qjg(null, this, OfficialLiveInfo$follow$2.INSTANCE);
    private final qjg vicons$delegate = new qjg(null, this, OfficialLiveInfo$vicons$2.INSTANCE);
    private final qjg viconInfos$delegate = new qjg(null, this, OfficialLiveInfo$viconInfos$2.INSTANCE);
    private final qjg itemNoBeaty$delegate = new qjg(null, this, OfficialLiveInfo$itemNoBeaty$2.INSTANCE);
    private final qjg officialLiveIcon$delegate = new qjg(null, this, OfficialLiveInfo$officialLiveIcon$2.INSTANCE);
    private final qjg officialLiveAtmosphereLottieUrl$delegate = new qjg(null, this, OfficialLiveInfo$officialLiveAtmosphereLottieUrl$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536398);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(OfficialLiveInfo officialLiveInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/OfficialLiveInfo");
    }

    public final String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return (String) this.accountId$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return (String) this.accountName$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getActivityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3792a849", new Object[]{this});
        }
        return (String) this.activityName$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getActivityStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6de1b682", new Object[]{this});
        }
        return (String) this.activityStatus$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getEncryptAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7f0e5a", new Object[]{this});
        }
        return (String) this.encryptAnchorId$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa1a4eb2", new Object[]{this});
        }
        return (String) this.follow$delegate.b(this, $$delegatedProperties[11]);
    }

    public final String getItemNoBeaty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f15cf620", new Object[]{this});
        }
        return (String) this.itemNoBeaty$delegate.b(this, $$delegatedProperties[14]);
    }

    public final String getLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d853caae", new Object[]{this});
        }
        return (String) this.location$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getOfficialHeadImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4f3f217", new Object[]{this});
        }
        return (String) this.officialHeadImg$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getOfficialLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a3902c", new Object[]{this});
        }
        return (String) this.officialLive$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getOfficialLiveAtmosphereLottieUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f589d578", new Object[]{this});
        }
        return (String) this.officialLiveAtmosphereLottieUrl$delegate.b(this, $$delegatedProperties[16]);
    }

    public final String getOfficialLiveIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b197b3", new Object[]{this});
        }
        return (String) this.officialLiveIcon$delegate.b(this, $$delegatedProperties[15]);
    }

    public final String getOfficialLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d671a911", new Object[]{this});
        }
        return (String) this.officialLiveId$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getOfficialLiveTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d0cc7f7", new Object[]{this});
        }
        return (String) this.officialLiveTopic$delegate.b(this, $$delegatedProperties[10]);
    }

    public final String getPvCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9967e266", new Object[]{this});
        }
        return (String) this.pvCount$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getViconInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("535ca1ad", new Object[]{this});
        }
        return (String) this.viconInfos$delegate.b(this, $$delegatedProperties[13]);
    }

    public final String getVicons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e1cdbdf", new Object[]{this});
        }
        return (String) this.vicons$delegate.b(this, $$delegatedProperties[12]);
    }

    public final void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setAccountName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14d5aa7", new Object[]{this, str});
        } else {
            this.accountName$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setActivityName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b60d54d", new Object[]{this, str});
        } else {
            this.activityName$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setActivityStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f213b34", new Object[]{this, str});
        } else {
            this.activityStatus$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setEncryptAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a91c4", new Object[]{this, str});
        } else {
            this.encryptAnchorId$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setFollow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d97504", new Object[]{this, str});
        } else {
            this.follow$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setItemNoBeaty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f8fcbe", new Object[]{this, str});
        } else {
            this.itemNoBeaty$delegate.a(this, $$delegatedProperties[14], str);
        }
    }

    public final void setLocation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd02e588", new Object[]{this, str});
        } else {
            this.location$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setOfficialHeadImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b225a7", new Object[]{this, str});
        } else {
            this.officialHeadImg$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setOfficialLive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6ce9ca", new Object[]{this, str});
        } else {
            this.officialLive$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setOfficialLiveAtmosphereLottieUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efd4666", new Object[]{this, str});
        } else {
            this.officialLiveAtmosphereLottieUrl$delegate.a(this, $$delegatedProperties[16], str);
        }
    }

    public final void setOfficialLiveIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ed23", new Object[]{this, str});
        } else {
            this.officialLiveIcon$delegate.a(this, $$delegatedProperties[15], str);
        }
    }

    public final void setOfficialLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f9a85", new Object[]{this, str});
        } else {
            this.officialLiveId$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setOfficialLiveTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720b3ec7", new Object[]{this, str});
        } else {
            this.officialLiveTopic$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setPvCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a97f338", new Object[]{this, str});
        } else {
            this.pvCount$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setViconInfos(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f211b69", new Object[]{this, str});
        } else {
            this.viconInfos$delegate.a(this, $$delegatedProperties[13], str);
        }
    }

    public final void setVicons(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45288d77", new Object[]{this, str});
        } else {
            this.vicons$delegate.a(this, $$delegatedProperties[12], str);
        }
    }

    static {
        t2o.a(1004536397);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialLive", "getOfficialLive()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialHeadImg", "getOfficialHeadImg()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "accountName", "getAccountName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "activityName", "getActivityName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialLiveId", "getOfficialLiveId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "encryptAnchorId", "getEncryptAnchorId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "accountId", "getAccountId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "activityStatus", "getActivityStatus()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "pvCount", "getPvCount()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "location", "getLocation()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialLiveTopic", "getOfficialLiveTopic()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "follow", "getFollow()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "vicons", "getVicons()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "viconInfos", "getViconInfos()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "itemNoBeaty", "getItemNoBeaty()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl15);
        MutablePropertyReference1Impl mutablePropertyReference1Impl16 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialLiveIcon", "getOfficialLiveIcon()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl16);
        MutablePropertyReference1Impl mutablePropertyReference1Impl17 = new MutablePropertyReference1Impl(OfficialLiveInfo.class, "officialLiveAtmosphereLottieUrl", "getOfficialLiveAtmosphereLottieUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl17);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15, mutablePropertyReference1Impl16, mutablePropertyReference1Impl17};
    }
}
