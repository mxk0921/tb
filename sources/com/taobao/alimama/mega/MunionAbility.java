package com.taobao.alimama.mega;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.alimama.click.interact.InteractBuilder;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility;
import com.taobao.utils.Global;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.acj;
import tb.bcj;
import tb.ccj;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.t2o;
import tb.tao;
import tb.v3i;
import tb.zbj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/taobao/alimama/mega/MunionAbility;", "Lcom/taobao/android/abilityidl/ability/AbsMunionMonitorAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/acj;", "params", "Ltb/jdb;", "callback", "Ltb/xhv;", "commitIFSTrack", "(Ltb/kdb;Ltb/acj;Ltb/jdb;)V", "Ltb/bcj;", "commitInteractTrack", "(Ltb/kdb;Ltb/bcj;Ltb/jdb;)V", "Ltb/ccj;", "commitTaokeTrack", "(Ltb/kdb;Ltb/ccj;Ltb/jdb;)V", "Ltb/zbj;", "Ltb/tao;", "", "Lcom/alibaba/ability/result/ErrorResult;", "generateClickIdBy", "(Ltb/kdb;Ltb/zbj;)Ltb/tao;", "handleAdUrl", "alimama-ad-sdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MunionAbility extends AbsMunionMonitorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1021313044);
    }

    public static /* synthetic */ Object ipc$super(MunionAbility munionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/mega/MunionAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility
    public void commitIFSTrack(kdb kdbVar, acj acjVar, jdb jdbVar) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f4eaad", new Object[]{this, kdbVar, acjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(acjVar, "params");
        ckf.g(jdbVar, "callback");
        IfsBuilder withArgNamespace = AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), acjVar.f15659a).withArgPid(acjVar.c).withArgNamespace(acjVar.b);
        Map<String, ? extends Object> map = acjVar.d;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(v3i.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        withArgNamespace.withArgs(linkedHashMap).commit();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility
    public void commitInteractTrack(kdb kdbVar, bcj bcjVar, jdb jdbVar) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4957675", new Object[]{this, kdbVar, bcjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bcjVar, "params");
        ckf.g(jdbVar, "callback");
        InteractBuilder withNameSpace = AlimamaAdvertising.instance().buildInteractTracking(bcjVar.f16317a).withArgPid(bcjVar.c).withNameSpace(bcjVar.b);
        Map<String, ? extends Object> map = bcjVar.d;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(v3i.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        withNameSpace.withArgs(linkedHashMap).commit();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility
    public void commitTaokeTrack(kdb kdbVar, ccj ccjVar, jdb jdbVar) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e516ed", new Object[]{this, kdbVar, ccjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ccjVar, "params");
        ckf.g(jdbVar, "callback");
        AlimamaAdvertising instance = AlimamaAdvertising.instance();
        String str = ccjVar.f16973a;
        String str2 = ccjVar.b;
        String str3 = ccjVar.c;
        boolean z = ccjVar.d;
        Map<String, ? extends Object> map = ccjVar.e;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(v3i.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        instance.commitTaokeInfo(str, str2, str3, z, linkedHashMap);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility
    public tao<String, ErrorResult> generateClickIdBy(kdb kdbVar, zbj zbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("19003296", new Object[]{this, kdbVar, zbjVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(zbjVar, "params");
        return new tao<>(AlimamaAdvertising.instance().handleAdUrlForClickid(zbjVar.f32666a, zbjVar.b));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMunionMonitorAbility
    public tao<String, ErrorResult> handleAdUrl(kdb kdbVar, zbj zbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("de795e37", new Object[]{this, kdbVar, zbjVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(zbjVar, "params");
        return new tao<>(AlimamaAdvertising.instance().handleAdUrl(zbjVar.f32666a, zbjVar.b));
    }
}
