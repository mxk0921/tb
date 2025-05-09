package com.taobao.tao;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.homepage.plugin.MytaobaoRereshPlugin;
import com.taobao.mytaobao.homepage.plugin.TBMyTaobaoWVPlugin;
import com.taobao.mytaobao.newsetting.dx.DxSettingCommonSource;
import com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler;
import com.taobao.mytaobao.newsetting.dx.setting.MTBLogoutAccountEventHandler;
import com.taobao.mytaobao.newsetting.dx.setting.MTBSwitchAccountEventHandler;
import com.taobao.mytaobao.pop.bridge.TBMyTaobaoPopWVApiPlugin;
import com.taobao.tao.log.TLog;
import tb.cbx;
import tb.fm6;
import tb.fsw;
import tb.gc6;
import tb.gl6;
import tb.hdx;
import tb.ig5;
import tb.igj;
import tb.inm;
import tb.jv9;
import tb.ksh;
import tb.lsh;
import tb.msh;
import tb.n9v;
import tb.nc5;
import tb.osh;
import tb.qwp;
import tb.r0k;
import tb.rm6;
import tb.ssh;
import tb.t2o;
import tb.tsh;
import tb.ush;
import tb.uv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MytaobaoApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MytaobaoApplication mytaobaoApplication;
    public static long onCreateTimeMillis;
    public static boolean isinit = false;
    public static volatile boolean isPageCreated = false;

    static {
        t2o.a(745538222);
    }

    public static MytaobaoApplication getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MytaobaoApplication) ipChange.ipc$dispatch("f23a768e", new Object[0]);
        }
        return mytaobaoApplication;
    }

    public static /* synthetic */ Object ipc$super(MytaobaoApplication mytaobaoApplication2, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/MytaobaoApplication");
    }

    private void registerSetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b585f034", new Object[]{this});
            return;
        }
        ClassPool.instance().put("eventhandler.mtb.widget.setting.ut", gl6.class);
        ClassPool.instance().put("source.mtb.common.mtop.snapshot", DxSettingCommonSource.class);
        ClassPool.instance().put("eventhandler.mtb.widget.setting.switch", MTBSettingSwitchEventHandler.class);
        ClassPool.instance().put("eventhandler.mtb.widget.settingUriLink", gc6.class);
        ClassPool.instance().put("eventhandler.mtb.widget.applicationLink", nc5.class);
        ClassPool.instance().put("source.mtb.settings.resource", tsh.class);
        ClassPool.instance().put("eventHandler.mtb.logout.account", MTBLogoutAccountEventHandler.class);
        ClassPool.instance().put("eventHandler.mtb.switch.account", MTBSwitchAccountEventHandler.class);
        ClassPool.instance().put("source.mtb.user.setting.status", msh.class);
        ClassPool.instance().put(ssh.EVENT_HANDLER_CLICK_PICKER, ssh.class);
        ClassPool.instance().put(ssh.EVENT_HANDLER_SWITCH_PICKER, ssh.class);
        ClassPool.instance().put(ush.EVENT_HANDLER_SWITCH_REVERSE, ush.class);
        ClassPool.instance().put("transformer.mtb.general.settings.mergeItemAndStatus", ksh.class);
        ClassPool.instance().put("eventHandler.mtb.general.settings.onAppear", lsh.class);
        ClassPool.instance().put("source.mtb.widget.setting.video", hdx.class);
        ClassPool.instance().put(rm6.EVENT_HANDLER_SETTING_VIDEO, rm6.class);
        ClassPool.instance().put("source.mtb.widget.about.mytaobao", cbx.class);
        ClassPool.instance().put("eventhandler.mtb.widget.versionUpdate", fm6.class);
        ClassPool.instance().put("eventhandler.mtb.widget.about.version", ig5.class);
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        uv6.h();
        onCreateTimeMillis = System.currentTimeMillis();
        TLog.logi("MytaobaoApplication", "onCreate" + isinit);
        if (!isinit) {
            isinit = true;
            r0k.e();
            osh.b();
        }
        mytaobaoApplication = this;
        n9v.b();
        inm.f();
        igj.a();
        registerModule();
        new qwp().d();
        jv9.INSTANCE.n();
    }

    public void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[]{this});
            return;
        }
        try {
            fsw.h("MyTaobaoRefresh", MytaobaoRereshPlugin.class);
            fsw.h(TBMyTaobaoWVPlugin.TAG, TBMyTaobaoWVPlugin.class);
            fsw.h("TBMyTaobaoSettingStateWVApiPlugin", SettingStateWVApiPlugin.class);
            fsw.h(TBMyTaobaoPopWVApiPlugin.TAG, TBMyTaobaoPopWVApiPlugin.class);
            MUSEngine.registerModule("taoLiveModule", MtbBasementWeexApiPlugin.class);
            registerSetting();
            ComponentFrmModule.init();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
