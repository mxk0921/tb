package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ExtendableMessage;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public transient ExtensionMap<T> extensionMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class ExtendableBuilder<T extends ExtendableMessage<?>> extends Message.Builder<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ExtensionMap<T> extensionMap;

        public ExtendableBuilder() {
        }

        public static /* synthetic */ Object ipc$super(ExtendableBuilder extendableBuilder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/ExtendableMessage$ExtendableBuilder");
        }

        public <E> E getExtension(Extension<T, E> extension) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("baaecb03", new Object[]{this, extension});
            }
            ExtensionMap<T> extensionMap = this.extensionMap;
            if (extensionMap == null) {
                return null;
            }
            return (E) extensionMap.get(extension);
        }

        public <E> ExtendableBuilder<T> setExtension(Extension<T, E> extension, E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExtendableBuilder) ipChange.ipc$dispatch("9cd8286f", new Object[]{this, extension, e});
            }
            ExtensionMap<T> extensionMap = this.extensionMap;
            if (extensionMap == null) {
                this.extensionMap = new ExtensionMap<>(extension, e);
            } else {
                extensionMap.put(extension, e);
            }
            return this;
        }

        public ExtendableBuilder(ExtendableMessage<T> extendableMessage) {
            super(extendableMessage);
            ExtensionMap<T> extensionMap;
            if (extendableMessage != null && (extensionMap = extendableMessage.extensionMap) != null) {
                this.extensionMap = new ExtensionMap<>(extensionMap);
            }
        }
    }

    public ExtendableMessage(ExtendableMessage<T> extendableMessage) {
        super(extendableMessage);
        ExtensionMap<T> extensionMap;
        if (extendableMessage != null && (extensionMap = extendableMessage.extensionMap) != null) {
            this.extensionMap = new ExtensionMap<>(extensionMap);
        }
    }

    public static /* synthetic */ Object ipc$super(ExtendableMessage extendableMessage, String str, Object... objArr) {
        if (str.hashCode() == -1402147264) {
            super.setBuilder((Message.Builder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/ExtendableMessage");
    }

    public boolean extensionsEqual(ExtendableMessage<T> extendableMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3001a948", new Object[]{this, extendableMessage})).booleanValue();
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap != null) {
            return extensionMap.equals(extendableMessage.extensionMap);
        }
        if (extendableMessage.extensionMap == null) {
            return true;
        }
        return false;
    }

    public int extensionsHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d195ed49", new Object[]{this})).intValue();
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap == null) {
            return 0;
        }
        return extensionMap.hashCode();
    }

    public String extensionsToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2a8c459", new Object[]{this});
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap == null) {
            return "{}";
        }
        return extensionMap.toString();
    }

    public <E> E getExtension(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("baaecb03", new Object[]{this, extension});
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap == null) {
            return null;
        }
        return (E) extensionMap.get(extension);
    }

    public List<Extension<T, ?>> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap == null) {
            return Collections.emptyList();
        }
        return extensionMap.getExtensions();
    }

    public void setBuilder(ExtendableBuilder<T> extendableBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ddff28", new Object[]{this, extendableBuilder});
            return;
        }
        super.setBuilder((Message.Builder) extendableBuilder);
        ExtensionMap<T> extensionMap = extendableBuilder.extensionMap;
        if (extensionMap != null) {
            this.extensionMap = new ExtensionMap<>(extensionMap);
        }
    }

    public <E> T setExtension(Extension<T, E> extension, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ExtendableMessage) ipChange.ipc$dispatch("afb8c992", new Object[]{this, extension, e}));
        }
        ExtensionMap<T> extensionMap = this.extensionMap;
        if (extensionMap == null) {
            this.extensionMap = new ExtensionMap<>(extension, e);
        } else {
            extensionMap.put(extension, e);
        }
        return this;
    }

    public ExtendableMessage() {
    }
}
