package gsperrorhandling

class BombTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "bomb"

    def shouldBomb = { attrs ->
        out << '<div cass="errors">'
        out << $ { itBomb }
        out << '</div>'
    }
}
