package com.squareup.wire;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;
import tb.qs8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message {
    transient qs8<T> extensionMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class a<T extends ExtendableMessage<?>> extends Message.b<T> {
    }

    public ExtendableMessage(ExtendableMessage<T> extendableMessage) {
        super(extendableMessage);
        qs8<T> qs8Var;
        if (extendableMessage != null && (qs8Var = extendableMessage.extensionMap) != null) {
            this.extensionMap = new qs8<>(qs8Var);
        }
    }

    public boolean extensionsEqual(ExtendableMessage<T> extendableMessage) {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var != null) {
            return qs8Var.equals(extendableMessage.extensionMap);
        }
        if (extendableMessage.extensionMap == null) {
            return true;
        }
        return false;
    }

    public int extensionsHashCode() {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var == null) {
            return 0;
        }
        return qs8Var.hashCode();
    }

    public String extensionsToString() {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var == null) {
            return "{}";
        }
        return qs8Var.toString();
    }

    public <E> E getExtension(b<T, E> bVar) {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var == null) {
            return null;
        }
        return (E) qs8Var.a(bVar);
    }

    public List<b<T, ?>> getExtensions() {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var == null) {
            return Collections.emptyList();
        }
        return qs8Var.d();
    }

    public void setBuilder(a<T> aVar) {
        super.setBuilder((Message.b) aVar);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> T setExtension(b<T, E> bVar, E e) {
        qs8<T> qs8Var = this.extensionMap;
        if (qs8Var == null) {
            this.extensionMap = new qs8<>(bVar, e);
        } else {
            qs8Var.f(bVar, e);
        }
        return this;
    }

    public ExtendableMessage() {
    }
}
