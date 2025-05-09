package com.taobao.edlp.tabbar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.drs;
import tb.fs0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IEdlpTabBarActionButtonProvider {
    public static final String UPDATE_FORCE_REMOTE = "5";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum ExposeUtTypeEnum {
        DEFAULT_ICON,
        SELECT_ICON,
        STRANGE_ICON,
        STATIC_ICON_WITH_RED,
        STATIC_ICON;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExposeUtTypeEnum exposeUtTypeEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/IEdlpTabBarActionButtonProvider$ExposeUtTypeEnum");
        }

        public static ExposeUtTypeEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExposeUtTypeEnum) ipChange.ipc$dispatch("48f7b973", new Object[]{str});
            }
            return (ExposeUtTypeEnum) Enum.valueOf(ExposeUtTypeEnum.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum OperTypeEnum {
        ADDVIEWTOBAR,
        DELETEVIEWTOBAR,
        DELETEINCON;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(OperTypeEnum operTypeEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/IEdlpTabBarActionButtonProvider$OperTypeEnum");
        }

        public static OperTypeEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OperTypeEnum) ipChange.ipc$dispatch("da28b008", new Object[]{str});
            }
            return (OperTypeEnum) Enum.valueOf(OperTypeEnum.class, str);
        }
    }

    ExposeUtTypeEnum a();

    fs0 b();

    JSONObject c();

    drs d();

    void init();

    void unInit();
}
