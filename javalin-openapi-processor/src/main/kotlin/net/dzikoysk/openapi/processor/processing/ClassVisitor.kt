package net.dzikoysk.openapi.processor.processing

import javax.lang.model.type.TypeMirror

class ClassVisitor : DefaultVisitor<TypeMirror, Void?>() {

    @Suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
    override fun visitType(typeMirror: TypeMirror, unused: Void?): TypeMirror = typeMirror

}