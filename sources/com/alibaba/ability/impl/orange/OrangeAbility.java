package com.alibaba.ability.impl.orange;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOrangeAbility;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.model.NameSpaceDO;
import java.util.Map;
import org.json.JSONObject;
import tb.a07;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.p8l;
import tb.r9l;
import tb.s9l;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class OrangeAbility extends AbsOrangeAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(124780546);
    }

    public static /* synthetic */ Object ipc$super(OrangeAbility orangeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/orange/OrangeAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public void downloadConfigWithParams(kdb kdbVar, p8l p8lVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e9477", new Object[]{this, kdbVar, p8lVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(p8lVar, "params");
        ckf.g(jdbVar, "callback");
        try {
            NameSpaceDO nameSpaceDO = new NameSpaceDO();
            nameSpaceDO.setChangeVersion(p8lVar.f25942a);
            nameSpaceDO.highLazy = Integer.valueOf(p8lVar.b);
            nameSpaceDO.loadLevel = p8lVar.c;
            nameSpaceDO.md5 = p8lVar.d;
            nameSpaceDO.name = p8lVar.e;
            nameSpaceDO.resourceId = p8lVar.f;
            nameSpaceDO.type = p8lVar.g;
            nameSpaceDO.version = p8lVar.h;
            if (ConfigCenter.getInstance().mIsOrangeInit.get()) {
                ConfigCenter.getInstance().loadConfig(nameSpaceDO);
            } else {
                jdbVar.O(new ErrorResult("500", "Orange not init", (Map) null, 4, (a07) null));
            }
        } catch (Exception e) {
            jdbVar.O(new ErrorResult("500", "未知错误: " + e.getMessage(), (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public tao<String, ErrorResult> get(kdb kdbVar, s9l s9lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("87bcd297", new Object[]{this, kdbVar, s9lVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(s9lVar, "params");
        return new tao<>(OrangeConfig.getInstance().getConfig(s9lVar.f27885a, s9lVar.b, ""), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public tao<String, ErrorResult> getCustomGroup(kdb kdbVar, r9l r9lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("225f355c", new Object[]{this, kdbVar, r9lVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(r9lVar, "params");
        return new tao<>(OrangeConfig.getInstance().getCustomConfig(r9lVar.f27211a, ""), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public tao<Map<String, Object>, ErrorResult> getIndexAndConfigs(kdb kdbVar) {
        tao<Map<String, Object>, ErrorResult> taoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("8e739a46", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        try {
            JSONObject indexAndConfigs = ConfigCenter.getInstance().getIndexAndConfigs();
            if (indexAndConfigs == null) {
                taoVar = new tao<>(null, new ErrorResult("500", "IndexAndConfigs null", (Map) null, 4, (a07) null));
            } else {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(indexAndConfigs.toString());
                ckf.f(parseObject, "JSONObject.parseObject(indexAndConfigs.toString())");
                taoVar = new tao<>(parseObject, null, 2, null);
            }
            return taoVar;
        } catch (Exception e) {
            return new tao<>(null, new ErrorResult("500", "未知错误: " + e.getMessage(), (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeAbility
    public tao<Map<String, Object>, ErrorResult> getStandardGroup(kdb kdbVar, r9l r9lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d6030b28", new Object[]{this, kdbVar, r9lVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(r9lVar, "params");
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(r9lVar.f27211a);
        if (configs != null) {
            return new tao<>(configs, null, 2, null);
        }
        return new tao<>(null, new ErrorResult("500", "Configs null", (Map) null, 4, (a07) null));
    }
}
