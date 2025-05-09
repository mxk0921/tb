package com.taobao.message.lab.comfrm.inner2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Command implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object data;
    private String name;
    private String sourceInstance;
    private String sourceName;

    static {
        t2o.a(537919578);
    }

    public static /* synthetic */ Object access$102(Command command, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("32110fd7", new Object[]{command, obj});
        }
        command.data = obj;
        return obj;
    }

    public static Command fromJSONString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Command) ipChange.ipc$dispatch("1af8167", new Object[]{str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        Command command = new Command(parseObject.getString("sourceInstance"), parseObject.getString("sourceName"), parseObject.getString("name"));
        command.data = parseObject.get("data");
        return command;
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public String getSourceInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a411e3f3", new Object[]{this});
        }
        return this.sourceInstance;
    }

    public String getSourceName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e44033d", new Object[]{this});
        }
        return this.sourceName;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Build {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Command command;

        static {
            t2o.a(537919580);
        }

        public Build(String str, String str2) {
            this.command = new Command(null, str, str2);
        }

        public Command build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Command) ipChange.ipc$dispatch("b93beba6", new Object[]{this});
            }
            return this.command;
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("7da5e824", new Object[]{this, obj});
            }
            Command.access$102(this.command, obj);
            return this;
        }

        public Build(String str, String str2, String str3) {
            this.command = new Command(str, str2, str3);
        }
    }

    private Command(String str, String str2, String str3) {
        this.sourceInstance = str;
        this.sourceName = str2;
        this.name = str3;
    }
}
