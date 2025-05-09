package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AppInfoScene f13591a = AppInfoScene.ONLINE;
    public boolean b = true;
    public AppInfoRequestScene c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum AppInfoRequestScene {
        PRELOAD("preload"),
        ASYNCLOAD("asyncload"),
        SYNCLOAD("syncload");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String name;

        AppInfoRequestScene(String str) {
            this.name = str;
        }

        public static /* synthetic */ Object ipc$super(AppInfoRequestScene appInfoRequestScene, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/core/requestConfig/AbsAppInfoRequestConfig$AppInfoRequestScene");
        }

        public static AppInfoRequestScene valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppInfoRequestScene) ipChange.ipc$dispatch("b2bcefbe", new Object[]{str});
            }
            return (AppInfoRequestScene) Enum.valueOf(AppInfoRequestScene.class, str);
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }
    }

    static {
        t2o.a(839909786);
    }

    public abstract JSONArray a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BasicRequestParam implements Serializable {
        public String appId;
        public String templateId;
        public String url;
        public String version;

        static {
            t2o.a(839909788);
        }

        public BasicRequestParam(String str, String str2, String str3) {
            this.templateId = "";
            this.appId = str;
            this.version = str2;
            this.url = str3;
        }

        public BasicRequestParam(String str, String str2) {
            this.templateId = "";
            this.url = "";
            this.appId = str;
            this.version = str2;
        }

        public BasicRequestParam(String str) {
            this.version = "*";
            this.templateId = "";
            this.url = "";
            this.appId = str;
        }

        public BasicRequestParam() {
            this.version = "*";
            this.templateId = "";
            this.url = "";
        }
    }
}
