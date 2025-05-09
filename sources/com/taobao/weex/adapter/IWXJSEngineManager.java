package com.taobao.weex.adapter;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWXJSEngineManager {

    /* JADX WARN: Init of enum QuickJS can be incorrect */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum EngineType {
        QuickJSBin("QJSBin", false, 2),
        QuickJS("QJS", false, r6.engineValue | 4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String engineName;
        private int engineValue;
        private boolean switchValue;
        private CopyOnWriteArrayList<String> urlList = new CopyOnWriteArrayList<>();

        static {
            EngineType engineType = QuickJSBin;
        }

        EngineType(String str, boolean z, int i) {
            this.switchValue = z;
            this.engineName = str;
            this.engineValue = i;
        }

        public static /* synthetic */ Object ipc$super(EngineType engineType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/adapter/IWXJSEngineManager$EngineType");
        }

        public static EngineType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EngineType) ipChange.ipc$dispatch("a543915d", new Object[]{str});
            }
            return (EngineType) Enum.valueOf(EngineType.class, str);
        }

        public String engineName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6ef75d2c", new Object[]{this});
            }
            return this.engineName;
        }

        public boolean engineOn() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b8237cc", new Object[]{this})).booleanValue();
            }
            return this.switchValue;
        }

        public int engineValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("446c8549", new Object[]{this})).intValue();
            }
            return this.engineValue;
        }

        public boolean hasPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2577a1e", new Object[]{this, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.urlList.contains(str);
        }

        public void setEngineValue(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f9d4c0", new Object[]{this, new Boolean(z)});
            } else {
                this.switchValue = z;
            }
        }
    }

    EngineType defaultEngine();

    boolean enableMainProcessScriptSide();

    Pair<EngineType, String> engineType(String str);

    boolean forceAllPageRunInMainProcessScriptSide();

    boolean runInMainProcess(String str);

    void setEngineSwitchValue(EngineType engineType, boolean z);

    void updateDisableUrlData(String str);

    void updateEnableUrlData(String str);
}
